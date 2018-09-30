/*1.Create a function for get on the bus. The number of new passengers should be
passed as a parameter.
2.Create a function for getting off the bus. The number of passengers who are
getting off should be passed as a parameter.
3.Each time these functions are called, they should print out the current capacity.
First the passengers fill up all the seats, and then the standing places when they get on the bus.
When they get off the bus, the standing places will be released first.
 We have 50 passengers. There is 0 empty seats and 133 standing places left.
 */

#include "Bus.h"

int standingPlaces = 147;
int seats = 36;
int passengers = 0;

void getOnTheBus (Bus bus, int nrOfNewPassengers)
{
    passengers += nrOfNewPassengers;
    bus.capacity = bus.numberOfSeats + bus.numberOfStandingPlaces;
    if (bus.capacity < nrOfNewPassengers) {
        printf("This is too much for this bus.\n");
        return;
    } else if (bus.numberOfSeats > 0) {
        if (bus.numberOfSeats >= nrOfNewPassengers) {
            bus.numberOfSeats -= nrOfNewPassengers;
        } else {
            nrOfNewPassengers -= bus.numberOfSeats;
            bus.numberOfSeats = 0;
        }
        if (nrOfNewPassengers > 0) {
            bus.numberOfStandingPlaces -= nrOfNewPassengers;
        }
    }
    printf("We have %d passengers. There is %d empty seats and %d standing places left.\n", passengers, bus.numberOfSeats, bus.numberOfStandingPlaces);
}

void getOffTheBus (Bus bus, int nrOfPassengersGettingOff)
{
    passengers -= nrOfPassengersGettingOff;
    if (bus.numberOfSeats == 0) {
        if (bus.numberOfStandingPlaces < standingPlaces) {
            nrOfPassengersGettingOff -= standingPlaces - bus.numberOfStandingPlaces;
            bus.numberOfStandingPlaces += standingPlaces - bus.numberOfStandingPlaces;
            if (nrOfPassengersGettingOff > 0) {
                bus.numberOfSeats += nrOfPassengersGettingOff;
            }
            return;
        } else if (bus.numberOfStandingPlaces == standingPlaces) {
            bus.numberOfSeats += nrOfPassengersGettingOff;
            return;
        }
    } else if (bus.numberOfSeats > 0) {
        bus.numberOfSeats += nrOfPassengersGettingOff;
    }
    printf("We have %d passengers. There is %d empty seats and %d standing places left.\n", passengers, bus.numberOfSeats, bus.numberOfStandingPlaces);
}

char* busWithTheLargestCapacity (Bus* buses, int arraySize)
{
    int capacity = 0;
    for (int i = 0; i < arraySize; i++) {
        buses[i].capacity = buses[i].numberOfSeats + buses[i].numberOfStandingPlaces;
        if (buses[i].capacity > capacity) {
            capacity = buses[i].capacity;
        }
    }
    for (int i = 0; i < arraySize; i++) {
         buses[i].capacity = buses[i].numberOfSeats + buses[i].numberOfStandingPlaces;
        if (buses[i].capacity == capacity) {
            return buses[i].name;
        }
    }
    return 0;
}
