#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    
    int userInput;
    printf("Please give me a number: \n");
    scanf("%d", &userInput);
    
    if (userInput % 2 == 1) {
        for (int i = 1; i <= (userInput + 1) / 2; i++) {
            double k = (userInput / 2) - i + 1;
            for (int l = 1; l <= k; l++) {
                printf(" ");
            }
            for (int j = 1; j <= abs(((i * 2) - 1)); j++) {
                printf("*");
            }
            printf("\n");
        }
        
        for (int m = 1; m <= (userInput - 1) / 2; m++) {
            for (int o = 1;  o <= m; o++) {
                printf(" ");
            }
            for (int p = 1; p <= userInput - (m * 2); p++) {
                printf("*");
            }
            printf("\n");
        }
    }
    
    if (userInput % 2 == 0) {
        for (int i = 1; i <= userInput / 2; i++) {
            double k = (userInput / 2) - i;
            for (int l = 1; l <= k; l++) {
                printf(" ");
            }
            for (int j = 1; j <= abs(((i * 2) - 1)); j++) {
                printf("*");
            }
            printf("\n");
        }
        for (int m = 0; m <= userInput / 2; m++) {
            for (int o = 1;  o <= m; o++) {
                printf(" ");
            }
            for (int p = 1; p <= (userInput - (m * 2)) -1; p++) {
                printf("*");
            }
             printf("\n");
        }
    }
    
}
