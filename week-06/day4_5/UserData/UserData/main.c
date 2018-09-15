#include <stdio.h>
#include <string.h>

// create a program which asks for full name and age
// and stores it in a char array
// parse that array to first_name, last_name, age (use tokenizing)
// print out the the stored variables
// example:
//   printf("Your name is: %s %s and you are %d years old", first_name, last_name, age);

int main ()
{
    char* first_name;
    char* last_name;
    char* age;
    char inputArray[100];
    printf("Please introduce your name and age: \n");
    fgets(inputArray,100,stdin);
    first_name = strtok (inputArray, " ");
    last_name = strtok(NULL, " ");
    age = strtok(NULL, " ");
    printf("Your name is: %s %s and you are %d years old.\n", first_name, last_name, atoi(age));
}
