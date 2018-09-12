#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8
    
    int number = 8;
    int k = 0;
    int i =2;
    
    do  {
        int userInput;
        printf("Guess the number: \n");
        scanf("%d", &userInput);
        if (userInput == number) {
            printf("You found the number: %d\n!", userInput);
            k = i;
        } else if (userInput < number) {
            printf("The stored number is higher! ");
            i++;
        } else if (userInput > number) {
            printf("The stored number is lower! ");
            i++;
        }
    } while (i != k);

}
