#include "Digimon.h"
#include <stdio.h>
#include <string.h>

int minHealth (Digimon* digimons, int sizeOfArray)
{
    int minHealth = digimons[0].health;
    int index = 0;
    for (int i = 0; i < sizeOfArray; i++) {
        if (digimons[i].health < minHealth) {
            minHealth = digimons[i].health;
            index = i;
        }
    }
    return index;
}

int countOfDigivolutionLevel (Digimon* digimons, int sizeOfArray, DigivolutionLevel level)
{
    int counter = 0;
    for (int i = 0; i < sizeOfArray; i++) {
        if (digimons[i].level == level) {
            counter++;
        }
    }
    return counter;
}

int countOfTamer (Digimon* digimons, int sizeOfArray, char tamer[])
{
    int counter = 0;
    for (int i = 0; i < sizeOfArray; i++) {
        if (strcmp(digimons[i].tamerName, tamer) == 0) {
            counter++;
        }
    }
    return counter;
}

double averageHealth (Digimon* digimons, int sizeOfArray, char tamer[])
{
    double health = 0;
    int counter = 0;
    for (int i = 0; i < sizeOfArray; i++) {
        if (strcmp(digimons[i].tamerName, tamer) == 0) {
            health += digimons[i].health;
            counter++;
        }
    }
    return health / counter;
}
