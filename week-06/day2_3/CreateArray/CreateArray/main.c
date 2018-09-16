#include <stdio.h>
#include <time.h>
#include <stdlib.h>

// create two functions:
// first should create an array dynamically (the size should be a user input)
// second sould fill the array with random numbers

int * createArray (int size);
void fillArray(int size, int array[]);

int main()
{
    int size;
    printf("What size of an array would you like to create?\n");
    scanf("%d", &size);
    fillArray(size, createArray(size));
}

int * createArray (int size)
{
    int* arrayOfRandomNumbers;
    arrayOfRandomNumbers = (int*) calloc (size, sizeof(int));
    return arrayOfRandomNumbers;
}

void fillArray(int size, int array[])
{
    int upper = 100;
    int lower = 10;
    for (int i = 0; i < size; i++) {
        array[i] = rand() % (upper - lower + 1) + lower;
        printf("%d, ", array[i]);
    }
    printf("\n");
}
