/* The "car"-s are stored in an array.
 *
 * Write the following functions:
 *  - get_older_cars_than(struct car* array, int array_length, int age)
 *      - it returns the count of the older cars than "age"
 *  - get_transmission_count(struct car* array, int array_length, enum transmission trnsm)
 *      - it returns the count of cars which has "trnsm" transmission
 */

#include "Car.h"

int get_older_cars (Car* carArray, int size, int age)
{
    int counter = 0;
    for (int i = 0; i < size; i++) {
        if (2018 - carArray[i].year > age) {
            counter++;
        }
    }
    return counter;
}

int get_transmission_count (Car* carArray, int size, Transmission trnsm)
{
    int counter = 0;
    for (int i = 0; i < size; i++) {
       if (carArray[i].transmission == trnsm) {
           counter++;
       }
    }
    return counter;
}
