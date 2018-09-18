#include <string.h>
#include <stdio.h>
#include "Car.h"

int main()
{
    Car car1;
    Car car2;
    Car car3;
    car1.year = 1992;
    car2.year = 2001;
    car3.year = 2010;
    car1.transmission = automatic;
    car2.transmission = CVT;
    car3.transmission = semiAutomatic;
    int age = 20;
    Transmission trnsm = manual;
    Car cars[] = {car1, car2, car3};
    printf("The number of cars that are older than %d is: %d\n", age, get_older_cars(cars, sizeof(cars) / sizeof(cars[0]), age));
    printf("The number of cars that belong to the manual is: %d\n", get_transmission_count(cars, sizeof(cars) / sizeof(cars[0]), trnsm));
}
