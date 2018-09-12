#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Crate a program that draws a chess table like this:
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    
    int userInput;
    printf("Please give me a number: \n");
    scanf("%d", &userInput);
    
    for (int i = 1; i <= userInput; i++) {
        if (i % 2 != 0) {
            for (int j = 1; j <= userInput; j++) {
                if (j % 2 != 0) {
                    printf("%%");
                } else printf(" ");
            }
        } else if (i % 2 == 0) {
            for (int j = 1; j <= userInput; j++) {
                if (j % 2 == 0) {
                    printf("%%");
                } else printf(" ");
            }
        }
        printf("\n");
    }
}
