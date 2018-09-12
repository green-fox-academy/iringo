
#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    int userInput1;
    int userInput2;
    int userInput3;
    int userInput4;
    int userInput5;
    
    printf("Please type in 5 numbers: \n");
    scanf("%d", &userInput1);
    scanf("%d", &userInput2);
    scanf("%d", &userInput3);
    scanf("%d", &userInput4);
    scanf("%d", &userInput5);
    int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
    double average = sum / 5;
    printf ("Sum: %d, Average: %.1f\n", sum, average);
}
