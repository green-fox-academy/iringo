#include <stdio.h>

int main(int argc, const char * argv[]) {
    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`
    
    int p1[] = {1, 2, 3};
    int p2[] = {4, 5};
    if (sizeof(p1)/sizeof(int) > sizeof(p2)/sizeof(int)) {
        for (int i = 0; i < sizeof(p1)/sizeof(p1[0]); i++) {
            printf("%d\n", p1[i]);
        }

    } else {
        for (int i = 0; i < sizeof(p2)/sizeof(p2[0]); i++) {
            printf("%d\n", p2[i]);
        }
    }
}
