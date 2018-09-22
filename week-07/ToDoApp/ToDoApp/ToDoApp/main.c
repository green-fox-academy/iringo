#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
#include "ToDo.h"

int main(int argc, char* argv[]) {
  
    printPrintUsage();
    char* filename = "tasks.txt";
    char* tasks[100];
    
    if (strcmp(argv[1], "-l") == 0) {
        printTasks(filename);
    } else if (strcmp(argv[1], "-a") == 0) {
        if (argc == 2) {
            printf("Unable to add: no task provided.\n");
        } else {
            int j = 0;
            for (int i = 2; i < argc; i++) {
                tasks[j] = argv[i];
                j++;
            }
            addTasks(filename, tasks, argc-2);
        }
    } else if (strcmp(argv[1], "-r") == 0) {
        if (argc == 2) {
            printf("Unable to remove: no index provided.\n");
        } else if (countLines("tasks.txt") < 2) {
            printf("The list does not have at least two elements, unable to remove.\n");
        } else if (countLines("tasks.txt") < atoi(argv[2])) {
            printf("Unable to remove: index is out of bound.\n");
        } else if (atoi(argv[2]) == 0) {
             printf("Unable to remove: index is not a number.\n");
        } else {
            int index = atoi(argv[2]);
            removeTasks(filename, index);
        }
    } else if (strcmp(argv[1], "-c") == 0) {
        if (countLines("tasks.txt") < 2) {
            printf("The list does not have at least two elements, unable to check.\n");
        } else if (countLines("tasks.txt") < atoi(argv[2])) {
            printf("Unable to check: index is out of bound.\n");
        } else if (atoi(argv[2]) == 0) {
            printf("Unable to check: index is not a number.\n");
        } else {
            int index = atoi(argv[2]);
            checkTasks(filename, index);
            
        }
    } else {
        printf("Unsupported argument.\n");
    }
}
