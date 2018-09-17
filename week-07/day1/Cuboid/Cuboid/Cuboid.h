#ifndef Cuboid_h
#define Cuboid_h

struct rectangular_cuboid {
    double a;
    double b;
    double c;
};

double GetSurface(struct rectangular_cuboid cuboid);
double GetVolume(struct rectangular_cuboid cuboid);

#endif /* Cuboid_h */
