/* Write a car register!
* You should store the following data in a structure, called "car":
*  - the manufacturer's name (which is shorter than 256 characters)
*  - the price of the car (in euros, stored as a floating point number)
*  - the year of manufacture
*  - the type of the transmission (as a custom type, see below)
*
* You should store the transmission type in an enumeration ("transmission"),
* the valid types are:
*  - manual
*  - automatic
*  - CVT
*  - semi-automatic
 - dual-clutch*/

#ifndef Car_h
#define Car_h

typedef enum {
    manual,
    automatic,
    CVT,
    semiAutomatic,
    dualClutch
} Transmission;

typedef struct {
    char name[256];
    float price;
    int year;
    Transmission transmission;
} Car;

int get_older_cars (Car* carArray, int size, int age);
int get_transmission_count (Car* carArray, int size, Transmission trnsm);

#endif /* Car_h */
