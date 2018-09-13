#include <stdio.h>
#include <stdlib.h>

int main(int argc, const char * argv[]) {
    // with malloc
    // please allocate a 10 long array and fill it with 5!! numbers from 0 to 4, then print the whole array
    // please delete the array before the program exits
    
    int* pointer = NULL;
    pointer = (int*) malloc (5 * sizeof(int));
    for (int i = 0; i < 5; i++) {
        pointer[i] = i;
        printf("%d, ", pointer[i]);
    }
    free(pointer);
}
