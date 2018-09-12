#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    
    int numberOfLines;
    printf("Please indicate a number: \n");
    scanf("%d", &numberOfLines);
    for (int i = 1; i <= numberOfLines; i++) {
        for (int j = 0; j < i; j++) {
            printf("*");
        }
        printf("\n");
    }
}
