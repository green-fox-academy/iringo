#ifndef ToDo_h
#define ToDo_h

void printPrintUsage(void);
void printTasks(char* filename);
void addTasks (char* filename, char** toDoTask , int sizeOfArray);
int countLines (char* filename);
void removeTasks (char* filename, int index);
void checkTasks (char* filename, int index);

#endif /* ToDo_h */
