# include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "ToDo.h"

void printPrintUsage(void)
{
    printf("Command Line Todo Application\n=============================\n");
    printf("Command line arguments: \n-l\tLists all the tasks\n-a\tAdds a new task\n-r\tRemoves a task\n-c\tCompletes a task\n");
    printf("\n");
}

void printTasks(char* filename, CheckTasks check)
{
    int counter = 0;
    FILE *fpointer = fopen(filename, "r");
    char line[250];
    if (fpointer == NULL) {
        printf("Could not open the file!\n");
    } else {
        fseek(fpointer, 0, SEEK_END);
        unsigned long length = (unsigned long)ftell(fpointer);
        if (length > 0) {
            rewind(fpointer);
            while (!feof(fpointer)) {
                counter ++;
                fgets(line, 150, fpointer);
                if (check.check != counter) {
                     printf("%d - [] %s", counter, line);
                } else {
                     printf("%d - [x] %s", counter, line);
                }
            }
        } else {
            printf("No todos for today! :)\n");
        }
    }
    printf("\n");
    fclose(fpointer);
}

void addTasks (char* filename, char** toDoTask , int sizeOfArray)
{
    FILE *fpointer = fopen(filename, "a");
    fprintf (fpointer, "\n");
    for (int i = 0; i < sizeOfArray; i++) {
        fprintf (fpointer, "%s ", toDoTask[i]);
    }
}

int countLines (char* filename)
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

void removeTasks (char* filename, int index)
{
    FILE *srcFile;
    FILE *tempFile;
    srcFile  = fopen(filename, "r");
    tempFile = fopen("temp.txt", "w");
    rewind(srcFile);
    char buffer[1000];
    int count = 1;
    while ((fgets(buffer, 1000, srcFile)) != NULL) {
        if (index != count)
            fputs(buffer, tempFile);
        count++;
    }
    fclose(srcFile);
    fclose(tempFile);
    remove(filename);
    rename("temp.txt", filename);
}

CheckTasks checkTasks (char* filename, int index, CheckTasks check)
{
    FILE *fpointer = fopen(filename, "r");
    int counter = 1;
    if (fpointer == NULL) {
        printf("Could not open the file!\n");
    } else {
        while (!feof(fpointer)) {
            counter ++;
            if (counter == index) {
                check.check = index;
            }
        }
    }
    return check;
}
