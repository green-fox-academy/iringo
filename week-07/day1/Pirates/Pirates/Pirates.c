#include <stdio.h>
#include <string.h>
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

char* richestPirate (Pirate pirates[], int size)
{
    char* tmp_name = (char*) calloc (10, sizeof(char));
    int maxGold = pirates[0].gold_count;
    for (int i = 0; i < size; i++) {
        if (pirates[i].gold_count > maxGold && pirates[i].has_wooden_leg == 1) {
            maxGold = pirates[i].gold_count;
        }
    }
    for (int i = 0; i < size; i++) {
        if (pirates[i].gold_count == maxGold) {
            for (int j = 0; pirates[i].name[j] != '\0'; j++) {
                tmp_name[j] = pirates[i].name[j];
            }
        }
    }
    return tmp_name;
}
