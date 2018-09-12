
#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    int nrOfChickens;
    int nrOfPigs;
    
    printf("How many chickes do you have? \n");
    scanf("%d", &nrOfChickens);
    printf("How many pigs do you have? \n");
    scanf("%d", &nrOfPigs);
    printf("The farm has a total number of: %d animal legs.\n", nrOfChickens*2 + nrOfPigs*4);
    
}
