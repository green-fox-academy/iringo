#include <stdio.h>

// Create a struct to store coordinates (for example: int x and int y)
// Create an array which can store coordinates, do not create multidimensonal arrays here
// Fill up the coordinates in the array with random number.

typedef struct {
    int x;
    int y;
} coordinates;

int main()
{
    coordinates arrayOfCoordinates[10];
    int size = sizeof(arrayOfCoordinates) / sizeof(coordinates);
    int upper = 100;
    int lower = 0;
    for (int i = 0; i < size; i++) {
        arrayOfCoordinates[i].x = (rand() % (upper - lower + 1)) + lower;
        arrayOfCoordinates[i].y = (rand() % (upper - lower + 1)) + lower;
        printf("%d, %d\n", arrayOfCoordinates[i].x, arrayOfCoordinates[i].y);
    }
}
