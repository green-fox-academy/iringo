#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    // Sum: 22, Average: 4.4
    
    int userInput;
    printf("How many numbers do you want to enter? \n");
    scanf("%d", &userInput);
    int sum = 0;
    for (int i = 0; i < userInput; i++) {
        printf("Introduce the number:\n");
        int number;
        scanf("%d", &number);
        sum += number;
    }
    printf ("Sum: %d, Average: %.1f\n", sum, sum / (double)userInput);
}
