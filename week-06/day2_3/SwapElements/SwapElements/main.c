#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc` by using a function
// - That function should take an array as a parameter and return the correct array

void swapElements(char** s1);

int main()
{
    char* abc[3][6] = {"first", "second", "third"};
    swapElements(abc);

}

void swapElements(char** inputArray)
{
    char* temp = *inputArray[0];
    *inputArray[0] = *inputArray[2];
    *inputArray[2] = *temp;
    for (int i = 0; i < 4; i++) {
        printf("%s\n", inputArray[i]);
    }
}
