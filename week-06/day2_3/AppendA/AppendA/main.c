// - Create a char array variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
// - Print the result of `appendAFunc(typo)`

#include <stdio.h>
#include <stdlib.h>

char* appendAFunc(char* input);

int main(int argc, const char * argv[]) {
    char* typo = "Chinchill";
    printf ("%s\n", appendAFunc(typo));
}

char* appendAFunc(char* input)
{
    int i;
    char* outputArray = (char*) calloc (sizeof(*input) + 1, sizeof(char));
    for (int i = 0; input[i] != 0; i++) {
        outputArray[i] = input[i];
    }
    for(i = 0; outputArray[i] != '\0'; ++i);
    outputArray[i] = 'a';
    outputArray[i + 1] = '\0';
    return outputArray;
}
