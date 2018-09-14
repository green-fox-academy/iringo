#include <stdio.h>

// please allocate a 10 long array and fill it with even numbers
// please allocate a 10 long array and fill it with odd numbers
// select an array, and push the elements into the another array
// print it the array in descending order
// delete the arrays after you don't use them

int main(int argc, const char * argv[]) {
    int* pointer = NULL;
    int* pointer2 = NULL;
    pointer = (int*) calloc (10, sizeof(int));
    pointer2 = (int*) calloc (10, sizeof(int));
    for (int i = 0; i <= 10; i++){
        if (i % 2 == 0) {
            pointer[i] = i;
        } else {
            pointer2[i] = i;
        }
    }
    for (int i = 0; i <= sizeof(pointer); i++) {
        printf("%d ", pointer[i]);
    }
    printf("\n");
    for (int i = 0; i <= sizeof(pointer2); i++) {
        printf("%d ", pointer2[i]);
    }
    printf("\n");
    pointer = (int *)realloc(pointer, 20);
    int j =0;
    for (int i = 1; i < sizeof(pointer); i++) {
        if (pointer[i] == 0) {
            pointer[i] = pointer2[j];
            j++;
        }
    }
    for (int i = 0; i <= sizeof(pointer); i++) {
        printf("%d ", pointer[i]);
    }
    printf("\n");
    return 0;
}

