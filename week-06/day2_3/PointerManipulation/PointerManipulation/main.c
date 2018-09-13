#include <stdio.h>

int main(int argc, const char * argv[]) {
    // The "other_high_number_pointer" should point to the same memory address
    // without using the "&" operator.
    
    int high_number = 6655;
    
    int* hight_number_pointer = &high_number;
    int* other_high_number_pointer = hight_number_pointer;
    printf("Memory address 1: %p\n", hight_number_pointer);
    printf("Memory address 2: %p\n", other_high_number_pointer);
}
