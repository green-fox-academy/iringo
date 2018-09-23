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
    int* arrayOfNumbers = (int*) calloc (4, sizeof(int));
    arrayOfNumbers[0] = 1;
    arrayOfNumbers[1] = 2;
    int sizeOfArray = sizeof(arrayOfNumbers) / sizeof(int);
    int newSize = 10;
    int * pArray = resize(arrayOfNumbers, sizeOfArray, newSize);
    for(int i = 0; i < newSize; i++) {
        printf("%d, ", pArray[i]);
    }
}

int* resize (int* intArray, int sizeOfArray, int newSize)
{
    int* temp = (int*) calloc (newSize, sizeof(int));
    for (int i = 0; i < sizeOfArray; i++) {
        temp[i] = intArray[i];
    }
    free(intArray);
    return temp;
}
