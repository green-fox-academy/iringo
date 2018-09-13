#include <stdio.h>

int main(int argc, const char * argv[]) {
    //Add two numbers using pointers
    
    int a = 20;
    int b = 17;
    int *p_a = &a;
    int *p_b = &b;
    int sum = *p_a + *p_b;
    printf("The sum is: %d.\n", sum);
}
