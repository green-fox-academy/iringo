#include <stdlib.h>
#include <string.h>
#include "Pirates.h"

/* Create a struct that represents a pirate
 It should store:
 - name
 - an int value which tells us if he/she has a wooden leg?
 - gold count
 Create a function that takes an array of pirates (and it's length) then returns the sum of the golds of all pirates
 Create a function that takes an array of pirates (and it's length) then returns the average of the gold / pirate
 Create a function that takes an array of pirates (and it's length) then returns the name of the
 richest that has wooden leg */

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
    richestPirate(pirates, size);

}
