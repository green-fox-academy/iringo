// define a variable called PI with the value of 3.14
// create a function which takes the radius of a circle as a parameter
// and return the area of that cirle
// area = radius * radius * PI

#include <stdio.h>
#include <stdlib.h>
#define PI (3.14);

float areaOfACircle (float radius);

int main()
{
    float radius = 2.2;
    printf("%.2f\n", areaOfACircle(radius));
}

float areaOfACircle (float radius)
{
    float area = radius * radius * PI;
    return area;
}
