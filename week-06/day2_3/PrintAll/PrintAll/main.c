#include <stdio.h>

int main(int argc, const char * argv[]) {
    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print all the elements of `numbers`

    int numbers[] = {4, 5, 6, 7};
    for (int i = 0; i < sizeof(numbers)/sizeof(int); i++) {
        printf("%d, ", numbers[i]);
    }
}
