#include <stdio.h>

int main(int argc, const char * argv[]) {
  // print the memory address of the variable
    
    int number = 1234;
    int *pnum = &number;
    printf("Memory address %p\n", *pnum);

}
