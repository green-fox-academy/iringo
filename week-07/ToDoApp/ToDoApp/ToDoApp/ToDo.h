#ifndef ToDo_h
#define ToDo_h

typedef struct {
    char todos[500];
    int checked;
} ToDosStruct;

void printPrintUsage();
void printTasks(char* filename);
void addTasks (char* filename, char* toDoTask , int sizeOfArray);
int countLines (char* filename);
int checkTheString (char* toDoTask[], int size);
void removeTasks (char* filename, int index);
void checkTasks (char* filename, int index);

#endif /* ToDo_h */
