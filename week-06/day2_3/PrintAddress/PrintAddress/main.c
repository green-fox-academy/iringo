#include <stdio.h>

int main(int argc, const char * argv[]) {
  // print the memory address of the variable
    
    int number = 1234;
    int *pnum = &number;
    printf("Value: %d\nMemory address: %p\nPointer value: %d\nPointer address: %p\n\n", number, &number, *pnum, pnum);
    
}
