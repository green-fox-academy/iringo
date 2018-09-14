// Open a file called "my-file.txt"
// Write your name in it as a single line

#include <stdio.h>

int main(int argc, const char * argv[]) {
    FILE *fPointer;
    fPointer = fopen("my-file.txt", "w");
    fprintf(fPointer, "Iringo\n");
    fclose(fPointer);
}
