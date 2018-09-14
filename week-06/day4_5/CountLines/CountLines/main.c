// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file

#include <stdio.h>

int countNumberOfLines (char* filename);

int main(int argc, const char * argv[]) {
    char* filename = "CountLines/file.txt";
    FILE *fPointer = fopen(filename, "w");
    fprintf(fPointer, "I love dogs.\n");
    fprintf(fPointer, "I love dogs very much!\n");
    fclose(fPointer);
    printf("%d\n",countNumberOfLines(filename));
}

int countNumberOfLines (char* filename)
{
    int counter = 1;
    char ch;
    FILE *fpointer = fopen(filename, "r");
    if (fpointer == NULL) {
        printf("Could not open the file!");
        return 0;
    } else {
        while((ch = fgetc(fpointer)) !=  EOF) {
            if(ch == '\n') {
                counter++;
            }
        }
    }
    fclose(fpointer);
    return counter;
}


