#include <stdio.h>
#include <stdlib.h>

/**
 * Create a function called "resize" that takes a pointer to an int array, it's size and it's new size,
 * then it should return a new pointer that points to the new resized array.
 * It should copy all the elements to the new array, if the array is bigger it should fill all the new slots with zeros.
 * It should delete the old array.
 */

int* resize (int* intArray, int sizeOfArray, int newSize);

int main()
{
    int arrayOfNumbers[] = {1, 2, 3, 4};
    int sizeOfArray = sizeof(arrayOfNumbers) / sizeof(int);
    printf("%d", resize(arrayOfNumbers, sizeOfArray, 8));
}

int* resize (int* intArray, int sizeOfArray, int newSize)
{
    intArray = (int*) realloc (newSize, sizeof(int));
    if (newSize > sizeOfArray) {
        for (int i = sizeOfArray - 1; i < newSize; i++) {
            intArray[i] = 0;
        }
    }
    return *intArray;
}
