/*
 
 1.Create a function for get on the bus. The number of new passengers should be
 passed as a parameter.
 2.Create a function for getting off the bus. The number of passengers who are
 getting off should be passed as a parameter.
 3.Each time these functions are called, they should print out the current capacity.
 First the passengers fill up all the seats, and then the standing places when they get on the bus.
 When they get off the bus, the standing places will be released first.
 EXAMPLE:
 An Ikarus 280 has 147 standing places and 36 seats this means it can carry 183 person.
 - We start with an empty bus. First there are 50 new passengers. So after the get on
 function called it should inform us:
 We have 50 passengers. There is 0 empty seats and 133 standing places left.
 - Then we call the get off function with 20 passengers. This time it should print out something like this:
 We have 30 passengers. There is 0 seats left and 153 standing places.
 - If too much passengers wants to get in, our function simply should inform us, that this is too much for this
 bus and pass without any further action.
 4.Create a function which takes the whole bus array as a parameter and returns the name of the
 bus with the largest capacity.
 */

#include <stdio.h>
#include "Bus.h"

int main(int argc, const char * argv[]) {
    Bus bus1;
    Bus bus2;
    Bus bus3;
    
    strcpy(bus1.name, "bus1");
    strcpy(bus2.name, "bus2");
    strcpy(bus3.name, "bus3");
    bus1.numberOfSeats = 36;
    bus1.numberOfStandingPlaces = 147;
    bus2.numberOfSeats = 30;
    bus2.numberOfStandingPlaces = 150;
    bus3.numberOfSeats = 40;
    bus3.numberOfStandingPlaces = 160;
    getOnTheBus(bus1, 50);
    getOffTheBus(bus1, 20);
    Bus buses[] = {bus1, bus2, bus3};
    int sizeOfArray = sizeof(buses) / sizeof(buses[0]);
    printf("The bus with the largest capacity is: %s\n", busWithTheLargestCapacity(buses, sizeOfArray));
}
