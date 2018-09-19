#include "ToDo.h"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>


void printPrintUsage()
{
    printf("Command Line Todo Application\n=============================\n");
    printf("Command line arguments: \n-l\tLists all the tasks\n-a\tAdds a new task\n-r\tRemoves a task\n-c\tCompletes a task\n");
    printf("\n");
}

void printTasks(char* filename)
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
            int i = 0;
            while (!feof(fpointer)) {
                counter ++;
                fgets(line, 150, fpointer);
                printf("%d - %s", counter, line);
                i++;
            }
        } else {
            printf("No todos for today! :)\n");
        }
    }
    printf("\n");
    fclose(fpointer);
}

void addTasks (char* filename, char* toDoTask , int sizeOfArray)
{
    FILE *fpointer = fopen(filename, "a");
    fprintf(fpointer, "\n");
    for (int i = 0; i < sizeOfArray; i++) {
        fprintf(fpointer, "%s ", toDoTask[i]);
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

int checkTheString (char* toDoTask[], int size)
{
    int counter = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j != '\0'; j++) {
            if ((toDoTask[i][j] >= 'a' && toDoTask[i][j] <= 'z') || (toDoTask[i][j] >= 'A' && toDoTask[i][j] <= 'Z')) {
                counter++;
            }
        }
    }
    if (counter > 0) {
        return 0;
    }
    return 1;
}

void removeTasks (char* filename, int index)
{
    FILE *fp1, *fp2;
    char c;
    int temp = 1;
    fp1 = fopen(filename, "r");
    c = getc(fp1);
    rewind(fp1);
    fp2 = fopen("temp.txt", "w");
    c = getc(fp1);
    while (c != EOF) {
        c = getc(fp1);
        if (c == '\n')
            temp++;
        if (temp != index)
        {
            putc(c, fp2);
        }
    }
    fclose(fp1);
    fclose(fp2);
    remove(filename);
    rename("temp.txt", filename);
}

void checkTasks (char* filename, int index, ToDosStruct checked)
{
    FILE *fpointer = fopen(filename, "r");
    char line[250];
    int counter = 1;
    if (fpointer == NULL) {
        printf("Could not open the file!\n");
    } else {
        while (!feof(fpointer)) {
            counter ++;
            if (counter == index) {
                
            }
        }
    }
}

