//Create a function named create palindrome following your current language's style guide. It should take a string, create a palindrome from it and then return it.

#include <stdio.h>

void palindromeBuilder (char* inputArray);

int main(int argc, const char * argv[]) {
    char* string = "greenfox";
    palindromeBuilder(string);
}

void palindromeBuilder (char* inputArray)
{
    char* temp = (char*) calloc (strlen(inputArray)*2, sizeof(char));
    int j = 0;
    for (int i = 0; i < strlen(inputArray); i++) {
        temp[j] = inputArray[i];
        j++;
    }
    for (int i = strlen(inputArray)-1; i >= 0; i--){
        temp[j] = inputArray[i];
        j++;
    }
    temp[j] = '\0';
    for (int i = 0; i < strlen(temp); i++) {
        printf("%c", temp[i]);
    }
    printf("%\n");
}
