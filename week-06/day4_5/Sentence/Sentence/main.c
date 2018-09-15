// create a function which takes a char array as a parameter,
// and splits a string to words by space
// solve the problem with the proper string.h function

#include <stdio.h>
#include <string.h>

void splitString (char* str);

int main(int argc, const char * argv[]) {
    char sentence[] = "Hello everyone out there";
    printf ("Splitting string \"%s\" into tokens:\n",sentence);
    splitString(sentence);
}

void splitString (char* str)
{
    char* splitArray;
    splitArray = strtok (str, " ");
    while (splitArray != NULL) {
        printf("%s\n", splitArray);
        splitArray = strtok(NULL, " ");
    }
}
