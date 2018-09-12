#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot
    
    int inputNumber;
    printf ("Please type in the nmber: \n");
    scanf ("%d", &inputNumber);
    if (inputNumber <= 0) {
        printf("Not enough\n");
    } else if (inputNumber == 1) {
        printf("One\n");
    } else if (inputNumber == 2) {
        printf("Two\n");
    } else {
        printf("A lot\n");
    }
}
