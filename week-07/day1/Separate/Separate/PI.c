#include "PI.h"

float areaOfACircle (float radius)
{
    float area = radius * radius * PI;
    return area;
}

float circumferenceOfACircle (float radius)
{
    float circumference = 2 * radius * PI;
    return circumference;
}
