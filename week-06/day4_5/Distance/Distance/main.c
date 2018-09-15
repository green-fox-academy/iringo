#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// returns the distance between the first and last occurance of character 's'

int distance (char * inputArray);

int main ()
{
    char str[] = "This is a sample string";
    printf("The distance between the first and las occurence of character 's' is: %d.\n", distance(str));
    return 0;
}

int distance (char * inputArray)
{
    int first = 0;
    int last = 0;
    for (int i = 0; inputArray[i] != '\0'; i++) {
        if (inputArray[i] == 's') {
            first = i;
            break;
        }
    }
    for (int i = 0; inputArray[i] != '\0'; i++) {
        if (inputArray[i] == 's') {
            last = i;
        }
    }
    return last - first;
}
