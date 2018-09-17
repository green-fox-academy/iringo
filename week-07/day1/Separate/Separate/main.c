#include <stdio.h>
#include <stdlib.h>
#include "PI.h"

int main()
{
    float radius = 2.2;
    printf("Area of the circle: %.2f\n", areaOfACircle(radius));
    printf("Circumference of the circle: %.2f\n", circumferenceOfACircle(radius));
}
