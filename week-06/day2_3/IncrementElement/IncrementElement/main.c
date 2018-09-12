#include <stdio.h>

int main(int argc, const char * argv[]) {
    //- Create an array variable named `t`
    //  with the following content: `[1, 2, 3, 4, 5]`
    //- Increment the third element
    //- Print the third element
    
    int t[] = {1, 2, 3, 4, 5};
    t[2]++;
    printf("%d\n", t[2]);
}
