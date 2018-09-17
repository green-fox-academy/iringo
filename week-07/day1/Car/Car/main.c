#include <stdio.h>

// Write a function that takes a car as an argument and prints all it's stats
// If the car is a Tesla it should not print it's gas level

enum car_type {VOLVO, TOYOTA, LAND_ROVER, TESLA};

typedef struct {
    enum car_type type;
    double km;
    double gas;
} Car;

void printStats (Car car);

int main()
{
    Car car1;
    car1.type = VOLVO;
    car1.km = 20000;
    car1.gas = 60;
    Car car2;
    car2.type = TESLA;
    car2.km = 10000;
    car2.gas = 70;
    printStats(car1);
    printStats(car2);
}

void printStats (Car car)
{
    switch (car.type)
    {
        case TESLA:
            printf("%.2f\n", car.km);
            break;
        default:
            printf("%.2f, %.2f\n", car.km, car.gas);
    }
}
