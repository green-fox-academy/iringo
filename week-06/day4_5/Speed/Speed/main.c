// fix the program so it prints out the correct result!

#include <stdio.h>
#define DISTANCE 345

int main(int argc, const char * argv[]) {
    int seconds = 17;
    float speed = DISTANCE / (float) seconds;
    printf("%f\n", speed);
    return 0;
}
