#include <stdio.h>

/* Create a struct that represents a House
 It should store:
 - The address of the house
 - The price in EUR
 - The number of rooms
 - The area of the house in square meters
 The market price of the houses is 400 EUR / square meters
 Create a function that takes a pointer to a house and decides if it's worth to buy
 (if the price is lower than the calculated price from it's area)
 Create a function that takes an array of houses (and it's length), and counts the
 houses that are worth to buy. */

typedef struct {
    char address[20];
    double price;
    int numberOfRooms;
    double squareMeters;
} House;

int worthToBuy (House* house);
int countHousesThatAreWorthToBuy (House houses[], int size);


int main()
{
    House house1;
    house1.price = 10000;
    house1.squareMeters = 50;
    House house2;
    house2.price = 24500;
    house2.squareMeters = 60;
    printf("%d\n", worthToBuy(&house1));
    printf("%d\n", worthToBuy(&house2));
    House houses[] ={house1, house2};
    printf("The number of houses that are worth to be bought: %d\n", countHousesThatAreWorthToBuy(houses, sizeof(houses)/sizeof(houses[0])));
}

int worthToBuy (House* house)
{
    float calculatedPrice = house->squareMeters * 400;
    if (house->price < calculatedPrice) {
        return 1;
    }
    return 0;
}

int countHousesThatAreWorthToBuy (House houses[], int size)
{
    int counter = 0;
    for (int i = 0; i < size; i++) {
        if (worthToBuy(&houses[i]) == 1) {
            counter++;
        }
    }
    return counter;
}
