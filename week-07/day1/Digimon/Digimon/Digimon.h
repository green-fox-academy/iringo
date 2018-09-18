#ifndef Digimon_h
#define Digimon_h

typedef enum {
    baby,
    inTraining,
    rookie,
    champion,
    ultimate,
    mega
} DigivolutionLevel;

typedef struct {
    char name[128];
    int age;
    int health;
    char tamerName[256];
    DigivolutionLevel level;
} Digimon;

int minHealth (Digimon* digimons, int sizeOfArray);
int countOfDigivolutionLevel (Digimon* digimons, int sizeOfArray, DigivolutionLevel level);
int countOfTamer (Digimon* digimons, int sizeOfArray, char tamer[]);
double averageHealth (Digimon* digimons, int sizeOfArray, char tamer[]);

#endif /* Digimon_h */
