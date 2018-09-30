#ifndef Bus_h
#define Bus_h

#include <stdio.h>

typedef struct {
    char name[256];
    int numberOfSeats;
    int numberOfStandingPlaces;
    int capacity;
} Bus;

void getOnTheBus (Bus bus, int nrOfNewPassengers);
void getOffTheBus (Bus bus, int nrOfPassengersGettingOff);
char* busWithTheLargestCapacity (Bus* buses, int arraySize);

#endif /* Bus_h */
