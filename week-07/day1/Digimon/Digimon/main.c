#include <stdio.h>
#include "Digimon.h"

int main(int argc, const char * argv[]) {
    Digimon digimon1;
    Digimon digimon2;
    Digimon digimon3;
    digimon1.health = 50;
    digimon2.health = 60;
    digimon3.health = 30;
    digimon1.level = inTraining;
    digimon2.level = rookie;
    digimon3.level = baby;
    strcpy(digimon1.tamerName, "monster");
    strcpy(digimon2.tamerName, "monsterss");
    strcpy(digimon3.tamerName, "monster");
    
    DigivolutionLevel level = baby;
    char tamer[] = "monster";
    
    Digimon digimons[] = {digimon1, digimon2, digimon3};
    int size = sizeof(digimons) / sizeof(digimons[0]);

    printf ("The digimon having the lowest health is at the index of: %d\n", minHealth(digimons, size));
    printf("The number of digimons, who are at the same digivolution level: %d\n", countOfDigivolutionLevel(digimons, size, level));
    printf("The number of digimons, who have the same tamer name as %s, is: %d\n", tamer, countOfTamer(digimons, size, tamer));
    printf("The average health of the same tamer name digimons is: %.2f\n", averageHealth(digimons, size, tamer));
    
}
