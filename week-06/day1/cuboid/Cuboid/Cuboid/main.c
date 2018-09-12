
#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    // 2(ab + ac + bc).
    //  volume is abc
    
    double a = 10;
    double b = 10;
    double c = 10;
    double surface = 2 * (a*b + a*c + b*c);
    double volume = a * b * c;
    printf("Surface area: %.0f\n", surface);
    printf("Volume: %.0f\n", volume);
}
