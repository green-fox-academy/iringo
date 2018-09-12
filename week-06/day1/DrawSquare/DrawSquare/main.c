#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was
    
    int userInput;
    printf("Please give me a number: \n");
    scanf("%d", &userInput);
    
    for (int i = 1; i <= userInput; i++) {
        if (i == 1 || i == userInput) {
            for (int j = 1; j <= userInput; j++) {
                printf("%%");
            }
        } else if (i != 1 || i != userInput) {
            printf("%%");
            for (int k = 1; k <= (userInput - 2); k++) {
                printf(" ");
            }
            printf("%%");
        }
        printf("\n");
    }
    
}
