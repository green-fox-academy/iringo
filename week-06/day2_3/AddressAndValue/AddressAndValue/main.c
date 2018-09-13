#include <stdio.h>

int main(int argc, const char * argv[]) {
    //Print out the addresses with and without pointer
    //print out the values with and without pointer
    
    int number = 2017;
    float Pi = 3.14;
    char letter = 't';
    int *p_number = &number;
    float *p_Pi = &Pi;
    char *p_letter = &letter;
    
    printf("Values without pointers: %d, %.2f, %c\n", number, Pi, letter);
    printf("Values with pointers: %d, %.2f, %c\n", *p_number, *p_Pi, *p_letter);
}
