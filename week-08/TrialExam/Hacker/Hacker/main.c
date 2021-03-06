#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * Hacker:
 *
 * Create a function that should convert binary numbers
 * to a letter (from ASCII code).
 * Binary numbers are stored in the text.txt.
 *
 * text.txt example:
 * 01001101
 * 00101011
 *
 * Write the converted letters into me_the_hacker.txt.
 *
 * me_the_hacker.txt example:
 * kitty
 *
 * The function should should return with the converted word. (cica)
 */

int countNumberOfLines (char* filename);
char* convertToWord (char* filename);

int main()
{
    char* converted_word = convertToWord("text.txt");
    printf("%s\n", converted_word);
    free (converted_word);
    
}

char* convertToWord (char* filename)
{
    FILE *fPointer = fopen("text.txt", "r");
    FILE *fHPointer = fopen("me_the_hacker.txt", "a");
    char* binaryArray = (char*) calloc (countNumberOfLines(filename), sizeof(char));
    if (fPointer == NULL) {
        printf("Could not open the file!\n");
    } else {
        char buffer[1000];
        char* ptr;
        int sizeOfArray = countNumberOfLines("text.txt");
        int i = 0;
        while ((fgets(buffer, 1000, fPointer)) != NULL) {
            binaryArray[i] = strtol(buffer, &ptr, 2);
            i++;
        }
        for(int i = 0; i < sizeOfArray; i++) {
            fprintf (fHPointer, "%c", binaryArray[i]);
        }
        
    }
    fclose(fPointer);
    fclose(fHPointer);
    return binaryArray;
}

int countNumberOfLines (char* filename)
{
    int counter = 1;
    char ch;
    FILE *fpointer = fopen(filename, "r");
    while((ch = fgetc(fpointer)) !=  EOF) {
        if(ch == '\n') {
            counter++;
        }
    }
    fclose(fpointer);
    return counter;
}
