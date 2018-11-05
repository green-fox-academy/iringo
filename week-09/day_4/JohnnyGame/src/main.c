#include "stm32f7xx.h"
#include "stm32746g_discovery.h"
#include <string.h>

/* Private typedef -----------------------------------------------------------*/
/* Private define ------------------------------------------------------------*/
/* Private macro -------------------------------------------------------------*/
/* Private variables ---------------------------------------------------------*/

typedef enum lighting_state {
    ON,
    OFF
} lighting_state;

typedef enum playing {
    PLAYING,
    END,
    IGNORE_FIRST_INTERRUPT
} playing;

UART_HandleTypeDef uart_handle;
GPIO_InitTypeDef led_Red;
RNG_HandleTypeDef randomNumber;
TIM_HandleTypeDef TimHandle;
TIM_HandleTypeDef TimHandle2;
TIM_HandleTypeDef PwmHandle;
TIM_OC_InitTypeDef sConfig;
GPIO_InitTypeDef conf;

volatile uint32_t counter_of_lighting;
volatile lighting_state state = ON;
volatile int counter = 0;
volatile int push_counter = 0;
volatile playing state_of_game = IGNORE_FIRST_INTERRUPT;
volatile int gamestart = 0;

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

uint32_t generate_random_number();
void timer_init();
void button_init();
void pwm_init();

/* Private functions ---------------------------------------------------------*/
/**
 * @brief  Main program
 * @param  None
 * @retval None
 */

uint32_t generate_random_number(void)
{
    uint32_t rNumber;
    randomNumber.Instance = RNG;
    __HAL_RCC_RNG_CLK_ENABLE();
    HAL_RNG_Init(&randomNumber);
    HAL_RNG_GenerateRandomNumber(&randomNumber, &rNumber);
    int number = (rNumber % 10) + 1;
    return number;
}

void timer_init()
{
    __HAL_RCC_TIM4_CLK_ENABLE();
    TimHandle.Instance = TIM4;
    TimHandle.Init.Period = 1250;
    TimHandle.Init.Prescaler = 43200;
    TimHandle.Init.ClockDivision = TIM_CLOCKDIVISION_DIV1;
    TimHandle.Init.CounterMode = TIM_COUNTERMODE_UP;

    HAL_NVIC_SetPriority(TIM4_IRQn, 0x0F, 0x00);
    HAL_NVIC_EnableIRQ(TIM4_IRQn);
    HAL_TIM_Base_Init(&TimHandle);
    HAL_TIM_Base_Start_IT(&TimHandle);
}

void timer_2_init()
{
    HAL_TIM_Base_Stop_IT(&TimHandle2);
    __HAL_RCC_TIM3_CLK_ENABLE();
    TimHandle2.Instance = TIM3;
    TimHandle2.Init.Period = 5000;
    TimHandle2.Init.Prescaler = 43200;
    TimHandle2.Init.ClockDivision = TIM_CLOCKDIVISION_DIV1;
    TimHandle2.Init.CounterMode = TIM_COUNTERMODE_UP;

    HAL_NVIC_SetPriority(TIM3_IRQn, 0x0F, 0x00);
    HAL_NVIC_EnableIRQ(TIM3_IRQn);
    HAL_TIM_Base_Init(&TimHandle2);
    HAL_TIM_Base_Start_IT(&TimHandle2);

}

void button_init()
{
    __HAL_RCC_GPIOI_CLK_ENABLE();
    conf.Pin = GPIO_PIN_11;
    conf.Pull = GPIO_NOPULL;
    conf.Speed = GPIO_SPEED_FAST;
    conf.Mode = GPIO_MODE_IT_RISING;
    HAL_GPIO_Init(GPIOI, &conf);
    HAL_NVIC_SetPriority(EXTI15_10_IRQn, 0x0F, 0x00);
    HAL_NVIC_EnableIRQ(EXTI15_10_IRQn);
}

void pwm_init()
{
    __HAL_RCC_GPIOA_CLK_ENABLE();
    GPIO_InitTypeDef led_Red;
    led_Red.Pin = GPIO_PIN_15;
    led_Red.Mode = GPIO_MODE_AF_PP;
    led_Red.Pull = GPIO_PULLDOWN;
    led_Red.Speed = GPIO_SPEED_HIGH;
    led_Red.Alternate = GPIO_AF1_TIM2;
    HAL_GPIO_Init(GPIOA, &led_Red);

    __HAL_RCC_TIM2_CLK_ENABLE();

    PwmHandle.Instance = TIM2;
    PwmHandle.Init.Period = 100;
    PwmHandle.Init.Prescaler = 1;
    PwmHandle.Init.ClockDivision = TIM_CLOCKDIVISION_DIV1;
    PwmHandle.Init.CounterMode = TIM_COUNTERMODE_UP;

    HAL_TIM_PWM_Init(&PwmHandle);

    sConfig.OCMode = TIM_OCMODE_PWM1;
    sConfig.Pulse = 0;
    HAL_TIM_PWM_ConfigChannel(&PwmHandle, &sConfig, TIM_CHANNEL_1);

    HAL_TIM_Base_Start(&PwmHandle);
    HAL_TIM_PWM_Start(&PwmHandle, TIM_CHANNEL_1);

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

    BSP_LED_Init(LED_GREEN);
    timer_init();
    button_init();
    pwm_init();

    while (1)
    {

    }
}

void TIM4_IRQHandler()
{
    HAL_TIM_IRQHandler(&TimHandle);
}

void TIM3_IRQHandler()
{
    HAL_TIM_IRQHandler(&TimHandle2);
}

void HAL_TIM_PeriodElapsedCallback(TIM_HandleTypeDef *htim)
{
    if (gamestart == 0) {
        counter_of_lighting = generate_random_number();
        printf("The random number is: %lu\n", counter_of_lighting);
        gamestart++;
    }
    if (gamestart == 1 && htim->Instance == TIM4) {
            if (counter < counter_of_lighting * 2) {
                if (state == ON) {
                    BSP_LED_On(LED_GREEN);
                    state = OFF;
                } else if (state == OFF) {
                    BSP_LED_Off(LED_GREEN);
                    state = ON;
                }
                counter++;
            } else {
                timer_2_init();
                HAL_TIM_Base_Stop_IT(&TimHandle);
                HAL_TIM_Base_DeInit(&TimHandle);
            }
    } else if (htim->Instance == TIM3) {
        if (state_of_game == IGNORE_FIRST_INTERRUPT) {
            state_of_game = PLAYING;
        } else if (state_of_game == PLAYING) {
            if (push_counter == counter_of_lighting) {
                printf("You won!\n");
                TIM2->CCR1 = 100;
                state_of_game = END;
            } else {
                TIM2->CCR1 = 20;
                printf("You loose!\n");
                state_of_game = END;
            }
        }
    }
}

void EXTI15_10_IRQHandler()
{
    HAL_GPIO_EXTI_IRQHandler(conf.Pin);
}

void HAL_GPIO_EXTI_Callback(uint16_t GPIO_Pin)
{
    if (GPIO_Pin == conf.Pin) {
        if (state_of_game == END) {
            HAL_TIM_Base_Stop_IT(&TimHandle2);
            HAL_TIM_Base_DeInit(&TimHandle2);
            HAL_TIM_Base_Stop(&PwmHandle);
            HAL_TIM_Base_DeInit(&PwmHandle);
            timer_init();
            state_of_game = IGNORE_FIRST_INTERRUPT;
            gamestart = 0;
            push_counter = 0;
            counter = 0;
         } else {
            state_of_game = IGNORE_FIRST_INTERRUPT;
            timer_2_init();
            push_counter++;
            printf("Button pushed %d\n", push_counter);
         }
    }
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
    if (HAL_RCC_OscConfig(&RCC_OscInitStruct) != HAL_OK)
    {
        Error_Handler();
    }

    /* activate the OverDrive to reach the 216 Mhz Frequency */
    if (HAL_PWREx_EnableOverDrive() != HAL_OK)
    {
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
    if (HAL_RCC_ClockConfig(&RCC_ClkInitStruct, FLASH_LATENCY_7) != HAL_OK)
    {
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
    while (1)
    {
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