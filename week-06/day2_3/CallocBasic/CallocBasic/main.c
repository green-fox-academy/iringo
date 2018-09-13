#include <stdio.h>
#include <stdlib.h>

// with calloc
// please allocate a 10 long array and fill it with 5!! numbers from 0 to 4, then print the whole array
// please delete the array before the program exits
// what's the difference between this and the previous excersice?

int main() {
    int* pointer = NULL;
    pointer = (int*) calloc(5, sizeof(int));
    for (int i = 0; i < 5; i++) {
        printf("%d, ", pointer[i]);
    }
    printf("\n");
    for (int i = 0; i < 5; i++) {
        pointer[i] = i;
        printf("%d, ", pointer[i]);
    }
    free(pointer);
    return 0;
    
    // The difference between maloc and calloc is on the one hand their syntax. Secondly, the malloc initializes the memory, while the calloc leaves the memory uninitialized.
}
