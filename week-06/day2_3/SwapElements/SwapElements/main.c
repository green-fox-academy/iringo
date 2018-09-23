#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc` by using a function
// - That function should take an array as a parameter and return the correct array

char** swapElements(char** inputArray);

int main()
{
    char* abc[] = {"first", "second", "third"};
    char** newArray = swapElements(abc);
    for (int i = 0; i < 4; i++) {
        printf("%s, ", newArray[i]);
    }
}

char** swapElements(char** inputArray)
{
    char* temp = inputArray[0];
    inputArray[0] = inputArray[2];
    inputArray[2] = temp;
    return inputArray;
}
