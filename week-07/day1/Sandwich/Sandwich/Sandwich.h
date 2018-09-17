#ifndef Sandwich_h
#define Sandwich_h

typedef struct {
    char name[50];
    float price;
    float weight;
} Sandwich;

float calculatePrice (Sandwich sandwich, int amount);

#endif /* Sandwich_h */
