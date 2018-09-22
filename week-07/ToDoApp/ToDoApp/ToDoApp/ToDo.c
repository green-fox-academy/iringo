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
            while (!feof(fpointer)) {
                counter ++;
                fgets(line, 150, fpointer);
                printf("%d - %s", counter, line);
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
    if (srcFile == NULL) {
         printf("Could not open the file!\n");
    } else {
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
}

void checkTasks (char* filename, int index)
{
    FILE *srcFile;
    FILE *tempFile;
    srcFile  = fopen(filename, "r");
    tempFile = fopen("temp.txt", "w");
    char checkedTask[] = "[x] ";
    char notCheckedTask[] = "[] ";
    if (srcFile == NULL) {
        printf("Could not open the file!\n");
    } else {
        rewind(srcFile);
        char buffer[1000];
        int count = 1;
        while ((fgets(buffer, 1000, srcFile)) != NULL) {
            // Itt létrehozok egy ideiglenes tömböt, amibe majd belemásolom a sorokat.
            char *result = malloc(strlen(checkedTask) + strlen(buffer) + 1);
            // Ezzel az if-el pedig azt szeretném leelenőrízni, hogy van-e már ott [],
            //és ha iggen akkor azt törölje onnan ki, de valamiért ez így nem máködik...
            if (buffer[0] == '[') {
                char *ps = buffer;
                for (char *ps = buffer;  *ps != '\0'; ps++) {
                    *ps = *(ps+3);
                }
                *ps = '\0';
            }
            // Itt peddig belerakom a sorokat []-al vagy [x]-el attól függően, hogy épp melyik sorban vagyok.
            if (index == count){
                strcpy(result, checkedTask);
                strcat(result, buffer);
                fputs(result, tempFile);
                free(result);
            } else {
                strcpy(result, notCheckedTask);
                strcat(result, buffer);
                fputs(result, tempFile);
                free(result);
            }
            count++;
        }
        fclose(srcFile);
        fclose(tempFile);
        remove(filename);
        rename("temp.txt", filename);
    }
}
