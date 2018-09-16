// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// You have to create the file, you can use C-programming but it is not mandatory

#include <stdio.h>

int main(int argc, const char * argv[]) {
    FILE *fPointer;
    fPointer = fopen("program.txt", "w");
    fprintf(fPointer, "I love dogs.\n");
    fprintf(fPointer, "I love dogs very much!\n");
    fclose(fPointer);
    fPointer = fopen("program.txt", "r");
    char line[150];
    while (!feof(fPointer)) {
        fgets(line, 150, fPointer);
        printf("%s", line);
    }
    fclose(fPointer);
}
