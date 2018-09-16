#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

void reverseOrder (int inputArray[], int size);

int main()
{
    int aj[] = {3, 4, 5, 6, 7};
    int size = sizeof(aj) / sizeof(aj[0]);
    reverseOrder(aj, size);
}

void reverseOrder (int inputArray[], int size)
{
    int* tempArray = (int *)malloc(size * sizeof(int));
    int j = 0;
    for (int i = size-1; i >= 0; i--){
        tempArray[j] = inputArray[i];
        j++;
    }
    int k = 0;
    for (int i = 0; i < size; i++) {
        inputArray[i] = tempArray[k];
        k++;
        printf("%d, ", inputArray[i]);
    }
    printf("\n");
}
