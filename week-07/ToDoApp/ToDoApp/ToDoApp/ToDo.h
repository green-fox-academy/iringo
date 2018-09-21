#ifndef ToDo_h
#define ToDo_h

typedef struct {
    int check;
} CheckTasks;


void printPrintUsage(void);
void printTasks(char* filename, CheckTasks check);
void addTasks (char* filename, char** toDoTask , int sizeOfArray);
int countLines (char* filename);
void removeTasks (char* filename, int index);
CheckTasks checkTasks (char* filename, int index, CheckTasks check);

#endif /* ToDo_h */
