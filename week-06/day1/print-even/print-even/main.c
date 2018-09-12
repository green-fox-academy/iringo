#include <stdio.h>

int main(int argc, const char * argv[]) {
   // Create a program that prints all the even numbers between 0 and 500
    
    for (int i = 0; i <= 500; i++) {
        if (i % 2 == 0) {
            printf("%d\n", i);
        }
    }

}
