
#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that asks for two numbers and prints the bigger one
    
    int userInput1;
    int userInput2;
    printf ("Please type in two numbers: \n");
    scanf("%d", &userInput1);
    scanf("%d", &userInput2);
    if (userInput1 > userInput2) {
        printf("%d\n", userInput1);
    } else {
        printf("%d\n", userInput2);
    }
}
