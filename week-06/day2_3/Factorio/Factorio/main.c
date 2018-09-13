
#include <stdlib.h>

// - Create a function called `factorio`
//   that returns it's input's factorial

int main()
{
    printf("The factorial of the number %d is: %d.\n", 9, factorio(9));
    return 0;
}

int factorio (int number) {
    int returnValue = 1;
    for (int i = 1; i <= number; i++) {
        returnValue *= i;
    }
    return returnValue;
}
