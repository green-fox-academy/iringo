#include <stdio.h>
#include "Pirates.h"

int sumOfGold (Pirate pirates[], int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += pirates[i].gold_count;
    }
    return sum;
}

double averageOfGold (Pirate pirates[], int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += pirates[i].gold_count;
    }
    return sum / size;
}

void richestPirate (Pirate pirates[], int size)
{
    int maxGold = pirates[0].gold_count;
    for (int i = 0; i < size; i++) {
        if (pirates[i].gold_count > maxGold && pirates[i].has_wooden_leg == 1) {
            maxGold = pirates[i].gold_count;
        }
    }
    for (int i = 0; i < size; i++) {
        if (pirates[i].gold_count == maxGold) {
            printf("%s\n", pirates[i].name);
        }
    }
}
