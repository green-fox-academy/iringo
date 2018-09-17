#ifndef Pirates_h
#define Pirates_h

typedef struct {
    char name[256];
    int has_wooden_leg;
    short int gold_count;
} Pirate;

int sumOfGold (Pirate pirates[], int size);
double averageOfGold (Pirate pirates[], int size);
void richestPirate (Pirate pirates[], int size);

#endif /* Pirates_h */
