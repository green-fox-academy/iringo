#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Create a function that takes an array as a paramater and returns the sum of the
//   elemnets in that array

int summingElements (int inputArray[], int size);

int main()
{
    int ai[] = {3, 4, 5, 6, 7};
    int size = sizeof(ai) / sizeof(ai[0]);
    printf("%d\n", summingElements(ai, size));
}

int summingElements (int inputArray[], int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += inputArray[i];
    }
    return sum;
}
