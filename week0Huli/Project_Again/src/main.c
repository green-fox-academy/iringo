#include "stm32f7xx.h"
#include "stm32746g_discovery.h"


/* Private typedef -----------------------------------------------------------*/
/* Private define ------------------------------------------------------------*/
/* Private macro -------------------------------------------------------------*/
/* Private variables ---------------------------------------------------------*/
UART_HandleTypeDef uart_handle;


GPIO_InitTypeDef vent_IC;
TIM_HandleTypeDef timer_pwm_vent;
TIM_HandleTypeDef rpm_timer;
TIM_IC_InitTypeDef rpm;
TIM_OC_InitTypeDef sConfig;
GPIO_InitTypeDef ventilator;

volatile char c[1];
char buffer[100];
volatile int counter = 0;
volatile int overflow = 0;
volatile int counter_max = 0;
volatile int latest_counter_value  = 0;
volatile int previous_counter_value = 0;
volatile int state_counter = 0;
volatile int rotation = 0;
float P = 0.05;
float I = 0.01;
int ctrler_out_min = 0;
int ctrler_out_max = 5100;
volatile int asd = 5100;
int integral = 0;


float get_freq();

//#undef __GNUC__

/* Private function prototypes -----------------------------------------------*/
#ifdef __GNUC__
/* With GCC/RAISONANCE, small printf (option LD Linker->Libraries->Small printf
 set to 'Yes') calls __io_putchar() */
#define PUTCHAR_PROTOTYPE int __io_putchar(int ch)
#else
#define PUTCHAR_PROTOTYPE int fputc(int ch, FILE *f)
#endif /* __GNUC__ */

static void SystemClock_Config(void);
static void Error_Handler(void);
static void MPU_Config(void);
static void CPU_CACHE_Enable(void);

/* Private functions ---------------------------------------------------------*/
/**
 * @brief  Main program
 * @param  None
 * @retval None
 */


void init_pwm_for_ventilator()
{
    __HAL_RCC_GPIOB_CLK_ENABLE();
    ventilator.Pin = GPIO_PIN_4;
    ventilator.Mode = GPIO_MODE_AF_PP;
    ventilator.Pull = GPIO_PULLDOWN;
    ventilator.Speed = GPIO_SPEED_HIGH;
    ventilator.Alternate = GPIO_AF2_TIM3;
    HAL_GPIO_Init(GPIOB, &ventilator);

    __HAL_RCC_TIM3_CLK_ENABLE();
    timer_pwm_vent.Instance = TIM3;
    timer_pwm_vent.Init.Period = 100;
    timer_pwm_vent.Init.Prescaler = 1;
    timer_pwm_vent.Init.ClockDivision = TIM_CLOCKDIVISION_DIV1;
    timer_pwm_vent.Init.CounterMode = TIM_COUNTERMODE_UP;

    HAL_TIM_PWM_Init(&timer_pwm_vent);

    sConfig.OCMode = TIM_OCMODE_PWM1;
    sConfig.Pulse = 100;
    HAL_TIM_PWM_ConfigChannel(&timer_pwm_vent, &sConfig, TIM_CHANNEL_1);

    HAL_TIM_Base_Start(&timer_pwm_vent);
    HAL_TIM_PWM_Start(&timer_pwm_vent, TIM_CHANNEL_1);
}



void init_timer_rpm(void)
{

    __HAL_RCC_GPIOA_CLK_ENABLE();
    vent_IC.Pin = GPIO_PIN_15;
    vent_IC.Mode = GPIO_MODE_AF_PP;
    vent_IC.Pull = GPIO_PULLDOWN;
    vent_IC.Speed = GPIO_SPEED_HIGH;
    vent_IC.Alternate = GPIO_AF1_TIM2;
    HAL_GPIO_Init(GPIOA, &vent_IC);

    __HAL_RCC_TIM2_CLK_ENABLE();
    rpm_timer.Instance = TIM2;
    rpm_timer.Init.Period = 65535;
    rpm_timer.Init.Prescaler = 0;
    rpm_timer.Init.ClockDivision = TIM_CLOCKDIVISION_DIV1;
    rpm_timer.Init.CounterMode = TIM_COUNTERMODE_UP;
    counter_max = 65535;

    HAL_TIM_Base_Init(&rpm_timer);
    HAL_TIM_Base_Start_IT(&rpm_timer);
    HAL_NVIC_SetPriority(TIM2_IRQn, 0x0F, 0x00);
    HAL_NVIC_EnableIRQ(TIM2_IRQn);

    rpm.ICPolarity = TIM_ICPOLARITY_RISING;
    rpm.ICPrescaler = TIM_ICPSC_DIV1;
    rpm.ICSelection = TIM_ICSELECTION_DIRECTTI;
    rpm.ICFilter = 0xF;

    HAL_TIM_IC_ConfigChannel(&rpm_timer, &rpm, TIM_CHANNEL_1);
    HAL_TIM_IC_Init(&rpm_timer);
    HAL_TIM_IC_Start_IT(&rpm_timer, TIM_CHANNEL_1);

}

int main(void) {
    /* This project template calls firstly two functions in order to configure MPU feature
     and to enable the CPU Cache, respectively MPU_Config() and CPU_CACHE_Enable().
     These functions are provided as template implementation that User may integrate
     in his application, to enhance the performance in case of use of AXI interface
     with several masters. */

    /* Configure the MPU attributes as Write Through */
    MPU_Config();

    /* Enable the CPU Cache */
    CPU_CACHE_Enable();

    /* STM32F7xx HAL library initialization:
     - Configure the Flash ART accelerator on ITCM interface
     - Configure the Systick to generate an interrupt each 1 msec
     - Set NVIC Group Priority to 4
     - Low Level Initialization
     */
    HAL_Init();

    /* Configure the System clock to have a frequency of 216 MHz */
    SystemClock_Config();

    /* Add your application code here */

    uart_handle.Init.BaudRate = 115200;
    uart_handle.Init.WordLength = UART_WORDLENGTH_8B;
    uart_handle.Init.StopBits = UART_STOPBITS_1;
    uart_handle.Init.Parity = UART_PARITY_NONE;
    uart_handle.Init.HwFlowCtl = UART_HWCONTROL_NONE;
    uart_handle.Init.Mode = UART_MODE_TX_RX;

    BSP_COM_Init(COM1, &uart_handle);
    HAL_UART_Receive_IT(&uart_handle, (uint8_t*) c, 1);
    HAL_NVIC_SetPriority(USART1_IRQn, 0x0F, 0x00);
    HAL_NVIC_EnableIRQ(USART1_IRQn);

    init_pwm_for_ventilator();
    init_timer_rpm();

    while (1) {
        //printf("%d\n", rotation);

        int process_variable = rotation;
        int error = asd - process_variable;
        integral += error;
        int ctrler_out = P * error + I * integral;


        if (ctrler_out < ctrler_out_min){
            ctrler_out = ctrler_out_min;
            integral = integral - error;
        }
        else if (ctrler_out > ctrler_out_max) {
            ctrler_out = ctrler_out_max;
            integral = integral - error;
        }
        ctrler_out = (float) ctrler_out / 5100 * 100;
        TIM3->CCR1 = ctrler_out;
        printf("%d\n", ctrler_out);
        printf("rotation:%d \n", rotation);
        HAL_Delay(10);


    }
}

void TIM2_IRQHandler()
{
    HAL_TIM_IRQHandler(&rpm_timer);
}

void HAL_TIM_PeriodElapsedCallback(TIM_HandleTypeDef *htim)
{
    if (htim->Instance == TIM2) {
        overflow++;
    }
}

void HAL_TIM_IC_CaptureCallback(TIM_HandleTypeDef *htim)
{
    if (htim->Instance == TIM2) {
        previous_counter_value = latest_counter_value;
        latest_counter_value = __HAL_TIM_GET_COUNTER(&rpm_timer);
        rotation = get_freq() * 60 / 7;
        overflow = 0;
    }
}

float get_freq()
{
    HAL_NVIC_DisableIRQ(TIM2_IRQn);
    int steps = ((overflow * counter_max) + latest_counter_value) - previous_counter_value;
    float freq = (float) 1 / ((1 / (float) 108000000) * steps);
    HAL_NVIC_EnableIRQ(TIM2_IRQn);
    return freq;
}


void USART1_IRQHandler()
{
    HAL_UART_IRQHandler(&uart_handle);
}

void HAL_UART_RxCpltCallback(UART_HandleTypeDef *huart)
{
    buffer[counter] = c[0];
    if (buffer[counter] == '\n') {
        buffer[counter] = '\0';
        int duty_cycle = atoi(buffer);
        if (duty_cycle > 0 && duty_cycle <= 100) {
            //TIM3->CCR1 = duty_cycle;
            asd = duty_cycle / (float) 100 * 5100;
        }
        counter = 0;
    } else {
        counter++;
    }
    HAL_UART_Receive_IT(&uart_handle, (uint8_t*)c, 1);
}



/**
 * @brief  Retargets the C library printf function to the USART.
 * @param  None
 * @retval None
 */
PUTCHAR_PROTOTYPE {
    /* Place your implementation of fputc here */
    /* e.g. write a character to the EVAL_COM1 and Loop until the end of transmission */
    HAL_UART_Transmit(&uart_handle, (uint8_t *) &ch, 1, 0xFFFF);

    return ch;
}

/**
 * @brief  System Clock Configuration
 *         The system Clock is configured as follow :
 *            System Clock source            = PLL (HSE)
 *            SYSCLK(Hz)                     = 216000000
 *            HCLK(Hz)                       = 216000000
 *            AHB Prescaler                  = 1
 *            APB1 Prescaler                 = 4
 *            APB2 Prescaler                 = 2
 *            HSE Frequency(Hz)              = 25000000
 *            PLL_M                          = 25
 *            PLL_N                          = 432
 *            PLL_P                          = 2
 *            PLL_Q                          = 9
 *            VDD(V)                         = 3.3
 *            Main regulator output voltage  = Scale1 mode
 *            Flash Latency(WS)              = 7
 * @param  None
 * @retval None
 */
static void SystemClock_Config(void) {
    RCC_ClkInitTypeDef RCC_ClkInitStruct;
    RCC_OscInitTypeDef RCC_OscInitStruct;

    /* Enable HSE Oscillator and activate PLL with HSE as source */
    RCC_OscInitStruct.OscillatorType = RCC_OSCILLATORTYPE_HSE;
    RCC_OscInitStruct.HSEState = RCC_HSE_ON;
    RCC_OscInitStruct.HSIState = RCC_HSI_OFF;
    RCC_OscInitStruct.PLL.PLLState = RCC_PLL_ON;
    RCC_OscInitStruct.PLL.PLLSource = RCC_PLLSOURCE_HSE;
    RCC_OscInitStruct.PLL.PLLM = 25;
    RCC_OscInitStruct.PLL.PLLN = 432;
    RCC_OscInitStruct.PLL.PLLP = RCC_PLLP_DIV2;
    RCC_OscInitStruct.PLL.PLLQ = 9;
    if (HAL_RCC_OscConfig(&RCC_OscInitStruct) != HAL_OK) {
        Error_Handler();
    }

    /* activate the OverDrive to reach the 216 Mhz Frequency */
    if (HAL_PWREx_EnableOverDrive() != HAL_OK) {
        Error_Handler();
    }

    /* Select PLL as system clock source and configure the HCLK, PCLK1 and PCLK2
     clocks dividers */
    RCC_ClkInitStruct.ClockType = (RCC_CLOCKTYPE_SYSCLK | RCC_CLOCKTYPE_HCLK
            | RCC_CLOCKTYPE_PCLK1 | RCC_CLOCKTYPE_PCLK2);
    RCC_ClkInitStruct.SYSCLKSource = RCC_SYSCLKSOURCE_PLLCLK;
    RCC_ClkInitStruct.AHBCLKDivider = RCC_SYSCLK_DIV1;
    RCC_ClkInitStruct.APB1CLKDivider = RCC_HCLK_DIV4;
    RCC_ClkInitStruct.APB2CLKDivider = RCC_HCLK_DIV2;
    if (HAL_RCC_ClockConfig(&RCC_ClkInitStruct, FLASH_LATENCY_7) != HAL_OK) {
        Error_Handler();
    }
}

/**
 * @brief  This function is executed in case of error occurrence.
 * @param  None
 * @retval None
 */
static void Error_Handler(void) {
    /* User may add here some code to deal with this error */
    while (1) {
    }
}

/**
 * @brief  Configure the MPU attributes as Write Through for SRAM1/2.
 * @note   The Base Address is 0x20010000 since this memory interface is the AXI.
 *         The Region Size is 256KB, it is related to SRAM1 and SRAM2  memory size.
 * @param  None
 * @retval None
 */
static void MPU_Config(void) {
    MPU_Region_InitTypeDef MPU_InitStruct;

    /* Disable the MPU */
    HAL_MPU_Disable();

    /* Configure the MPU attributes as WT for SRAM */
    MPU_InitStruct.Enable = MPU_REGION_ENABLE;
    MPU_InitStruct.BaseAddress = 0x20010000;
    MPU_InitStruct.Size = MPU_REGION_SIZE_256KB;
    MPU_InitStruct.AccessPermission = MPU_REGION_FULL_ACCESS;
    MPU_InitStruct.IsBufferable = MPU_ACCESS_NOT_BUFFERABLE;
    MPU_InitStruct.IsCacheable = MPU_ACCESS_CACHEABLE;
    MPU_InitStruct.IsShareable = MPU_ACCESS_SHAREABLE;
    MPU_InitStruct.Number = MPU_REGION_NUMBER0;
    MPU_InitStruct.TypeExtField = MPU_TEX_LEVEL0;
    MPU_InitStruct.SubRegionDisable = 0x00;
    MPU_InitStruct.DisableExec = MPU_INSTRUCTION_ACCESS_ENABLE;

    HAL_MPU_ConfigRegion(&MPU_InitStruct);

    /* Enable the MPU */
    HAL_MPU_Enable(MPU_PRIVILEGED_DEFAULT);
}

/**
 * @brief  CPU L1-Cache enable.
 * @param  None
 * @retval None
 */
static void CPU_CACHE_Enable(void) {
    /* Enable I-Cache */
    SCB_EnableICache();

    /* Enable D-Cache */
    SCB_EnableDCache();
}

#ifdef  USE_FULL_ASSERT

/**
 * @brief  Reports the name of the source file and the source line number
 *         where the assert_param error has occurred.
 * @param  file: pointer to the source file name
 * @param  line: assert_param error line source number
 * @retval None
 */
void assert_failed(uint8_t* file, uint32_t line)
{
    /* User can add his own implementation to report the file name and line number,
     ex: printf("Wrong parameters value: file %s on line %d\r\n", file, line) */

    /* Infinite loop */
    while (1)
    {
    }
}
#endif
