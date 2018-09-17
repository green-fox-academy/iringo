#include "Cuboid.h"

double GetSurface(struct rectangular_cuboid cuboid)
{
    return (2 * (cuboid.a * cuboid.b + cuboid.a * cuboid.c + cuboid.b * cuboid.c));
}

double GetVolume(struct rectangular_cuboid cuboid)
{
    return (cuboid.a * cuboid.b * cuboid.c);
}
