#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5
    
    int number1;
    int number2;
    printf("Please type in two numbers: \n");
    scanf("%d", &number1);
    scanf("%d", &number2);
    if (number1 >= number2) {
        printf("The second number should be bigger\n");
    } else {
        for (int i = number1; i < number2; i++) {
            printf("%d\n", i);
        }
    }
    
}
