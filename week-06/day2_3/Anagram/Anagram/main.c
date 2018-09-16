// Create a function named is anagram following your current language's style guide. It should take two strings and return a boolean value depending on whether its an anagram or not.

#include <stdio.h>

void anagramCheck (char* string1, char* string2);

int main(int argc, const char * argv[]) {
    char* string1 = "dog";
    char* string2 = "god";
    anagramCheck(string1, string2);
}

void anagramCheck (char* string1, char* string2)
{
    int j = strlen(string2);
    int counter = 0;
    for (int i = 0; i < strlen(string1); i++) {
        if (string1[i] == string2[j-1]) {
            counter++;
        }
        j--;
    }
    if (counter == strlen(string1)) {
        printf("True.\n");
    } else {
        printf("False.\n");
    }
}
