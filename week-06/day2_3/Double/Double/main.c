#include <stdio.h>
#include <stdlib.h>

// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - parameter should be a pointer to the variable you want to double

int* doubling (int* number);

int main()
{
    int number = 6;
    printf("The double amount of the number %d is: %d.\n", number, doubling(&number));
    return 0;
}

int* doubling (int* number)
{
    int output = *number * 2;
    return output;
}
