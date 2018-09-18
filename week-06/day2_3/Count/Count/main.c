#include <stdio.h>
#include <stdlib.h>

// Please create a program that asks for a count when it starts.
// It should ask for a number count times, then it shoud print the average of the numbers.
// It should delete any dynamically allocated resource before the program exits.

int main()
{
    int number;
    printf("Please insert a number: \n");
    scanf("%d", &number);
    int sum = 0;
    int introducedNumber;
    for (int i = 0; i < number; i++){
        printf("Please enter an integer:\n");
        scanf("%d", &introducedNumber);
        sum += introducedNumber;
    }
    double average = (double)sum / number;
    printf("The average of the ontroduced numbers is: %.2f\n", average);
}
