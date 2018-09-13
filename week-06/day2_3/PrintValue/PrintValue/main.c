#include <stdio.h>

int main(int argc, const char * argv[]) {
   // print the value of number using the "number_pointer"
    
    int number = 1234;
    int *number_pointer = &number;
    printf("Value of the number: %d\n", *number_pointer);
}
