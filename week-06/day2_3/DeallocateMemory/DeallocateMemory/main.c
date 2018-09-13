#include <stdio.h>
#include <stdlib.h>

// with malloc
// please allocate a 10 long array and fill it with even numbers then print the whole array
// please deallocate memory without using free

int main()
{
    int* pointer = NULL;
    pointer = (int*) calloc (10, sizeof(int));
    for (int i = 0; i <= sizeof(pointer); i+=2){
        pointer[i] = i;
        printf ("%d, ", pointer[i]);
    }
    printf ("\n");
    pointer = (int *)realloc(pointer, 0);
    for (int i = 0; i <= sizeof(pointer); i++){
        printf ("%d, ", pointer[i]);
    }
    return 0;
}
