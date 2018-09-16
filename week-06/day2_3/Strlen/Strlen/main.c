#include <stdio.h>
#include <stdlib.h>

// Create a function which receives a string as parameter, and returns
// the numbers of characters in the string.
// Don't use the strlen() function!

int numberOfCharacters (char * inputArray);

int main()
{
    char* word = "helloooo";
    printf("%d\n", numberOfCharacters(word));
    return 0;
}

int numberOfCharacters (char * inputArray)
{
    int i;
    for (i = 0; inputArray[i] != '\0'; i++);
    return i;
}
