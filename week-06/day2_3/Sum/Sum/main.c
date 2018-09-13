#include <stdio.h>
#include <stdlib.h>

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

int main()
{
    printf("The sum of the numbers until %d is: %d.\n", 8, sum(8));
    return 0;
}

int sum (int number)
{
    int finalSum = 0;
    for (int i = 1; i < number; i++) {
        finalSum += i;
    }
    return finalSum;
}
