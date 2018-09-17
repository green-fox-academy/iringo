#include <stdio.h>
#include "Cuboid.h"

// Write a function called "GetSurface" that takes a RectangularCuboid
// and returns it's surface
// Write a function called "GetVolume" that takes a RectangularCuboid
// and returns it's volume

int main()
{
    struct rectangular_cuboid cuboid;
    cuboid.a = 10;
    cuboid.b = 20;
    cuboid.c = 30;
    printf ("Surface of the cuboid is: %.2f\n", GetSurface(cuboid));
    printf ("Volume of the cuboid is: %.2f\n", GetVolume(cuboid));
}
