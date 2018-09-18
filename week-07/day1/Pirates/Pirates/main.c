#include <stdlib.h>
#include <string.h>
#include "Pirates.h"

int main()
{
    Pirate pirate1;
    Pirate pirate2;
    Pirate pirate3;
    
    strcpy(pirate1.name, "Johnny");
    strcpy(pirate2.name, "Dave");
    strcpy(pirate3.name, "Someone");
    
    pirate1.has_wooden_leg = 1;
    pirate2.has_wooden_leg = 0;
    pirate3.has_wooden_leg = 1;
    
    pirate1.gold_count = 10;
    pirate2.gold_count = 20;
    pirate3.gold_count = 30;
    
    Pirate pirates[] = {pirate1, pirate2, pirate3};
    int size = sizeof(pirates) / sizeof(pirates[0]);
    
    printf("The sum of gold is: %d\n", sumOfGold(pirates, size));
    printf("The average of gold is: %.2f\n", averageOfGold(pirates, size));
    printf("The riches pirate who has wooden leg is: %s\n",richestPirate(pirates, size));

}
