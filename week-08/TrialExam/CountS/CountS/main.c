#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int ends_Withs_S (char* filename);

int main(int argc, const char * argv[]) {
    printf("%d\n", ends_Withs_S("text.txt"));
}

int ends_Withs_S (char* filename)
{
    FILE *fPointer = fopen(filename, "r");
    int counter = 0;
    if (fPointer == NULL) {
        printf("Could not open the file!\n");
    } else {
        char buffer[1000];
         while ((fgets(buffer, 1000, fPointer)) != NULL) {
         }
         for (int i = 0; i < sizeof(buffer)/sizeof(char); i++) {
            if (buffer[i] == ' ' || buffer[i] == '\n') {
                if (buffer[i-1] == 's') {
                    counter++;
                } else if (buffer[i-1] == '.' || buffer[i-1] == ',' || buffer[i-1] == ';' ||buffer[i-1] == ':') {
                    if (buffer[i-2] == 's') {
                        counter++;
                    }
                }
            }
         }
    }
    fclose(fPointer);
    return counter;
}
