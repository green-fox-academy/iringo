#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// lists all position where character 'i' is found

void findsI (char* inputArray);

int main(int argc, const char * argv[]) {
    char string[] = "This is a string for testing";
    findsI(string);
}

void findsI (char* inputArray)
{
    for (int i = 0; inputArray[i] != '\0'; i++) {
        if (inputArray[i] == 'i') {
            printf("%d, ", i);
        }
    }
    printf("\n");
}
