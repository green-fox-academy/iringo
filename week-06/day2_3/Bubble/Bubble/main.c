//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending

#include <stdio.h>
#include <stdlib.h>

void sort (int inputArray[], int size, int boolean);
int compare (const void * a, const void * b);

int main(int argc, const char * argv[]) {
    int values[] = { 40, 10, 100, 90, 20, 25 };
    int size = sizeof(values) / sizeof(values[0]);
    sort(values, size, 0);
}

void sort (int inputArray[], int size, int boolean)
{
    if (boolean == 0) {
        qsort(inputArray, size, sizeof(int), compare);
    } else {
        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(inputArray[i] < inputArray[j]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
    }
    for (int i = 0; i < size; i++) {
        printf("%d, ", inputArray[i]);
    }
    printf("\n");
}

int compare (const void * a, const void * b)
{
    return (*(int*)a - *(int*)b );
}
