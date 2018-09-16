#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Create a function that takes an array as a parameter and,
//   doubles all the values in the original array
// - Example:
//   int array[] = {0, 32, 5, 71, 91};
//   double_items(array);
//   printf("%d\n", array[1]); // should print out 64

void doublingItems (int inputArray[], int size);

int main()
{
    int numlist[] = {0, 32, 5, 71, 91};
    int size = sizeof(numlist) / sizeof(numlist[0]);
    doublingItems(numlist, size);
}

void doublingItems (int inputArray[], int size)
{
    for (int i = 0; i < size; i++) {
        inputArray[i] = 2 * inputArray[i];
        printf("%d, ", inputArray[i]);
    }
}
