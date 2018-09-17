#include <stdio.h>
#include <stdlib.h>

// Implement a function that concatenates 2 strings (dest and source).
// The return value should be the concatenated strings.

char* concatenate (char* dest, char* source);

int main()
{
    char * string1 = "green";
    char * string2 = "fox";
    printf("%s\n", concatenate(string1, string2));
    return 0;
}

char* concatenate (char* dest, char* source)
{
    char* tmp_a = (char*) calloc (strlen(dest) + strlen(source), sizeof(char));
    int i;
    for (i = 0; dest[i] != '\0'; i++){
        tmp_a[i] = dest[i];
    }
    for (int j = 0; source[j] != '\0'; j++)
    {
        tmp_a[i] = source[j];
        i++;
    }
    tmp_a[i] = '\0';
    return tmp_a;
}
