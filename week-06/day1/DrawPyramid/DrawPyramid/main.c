#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    
    int numberOfRows;
    printf("Please give me a number: \n");
    scanf("%d", &numberOfRows);
    
    for (int i = 0; i <= numberOfRows; i++) {
        int numberOfSpaces = numberOfRows - i;
        for (int j = 1; j <= numberOfSpaces; j++) {
            printf(" ");
        }
        for (int k = 1; k <= (i*2)-1; k++) {
            printf("*");
        }
        printf("\n");
    }
}
