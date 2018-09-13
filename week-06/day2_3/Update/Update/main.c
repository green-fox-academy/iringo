#include <stdio.h>

int main(int argc, const char * argv[]) {
   // update the value of number variable to 42 using the "number_pointer"
    
    int number = 1234;
    int* number_pointer = &number;
    *number_pointer = 42;
    printf("The updated value is: %d.\n", *number_pointer);
}
