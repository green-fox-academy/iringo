#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/* Create a function called "range" that creates a new array and returns a pointer to it.
 * It should fill the array with numbers based on it's paramters.
 * It should take 3 paramters:
 * int from: the first number in the array
 * int to: it will fill the array till it would reach this number (so this number is not in the array)
 * int step: the step between the numbers
 *
 * Examples:
 * range(0, 10, 2) -> {0, 2, 4, 6, 8}
 * range(1, -8, -3) -> {1, -2, -5}
 *
 * It should delete any dynamically allocated resource before the program exits.
 */

int range(int from, int to, int step, int** outputArray);

int main()
{
    int * ptr = 0;
    int size = range(1, -8, -3, &ptr);
    for (int i = 0; i < size; i++) {
        printf("%d, ", ptr[i]);
    }
    printf("\n");
    free(ptr);
}

int range(int from, int to, int step, int** outputArray)
{
    int size = 0;
    if (from > 0 && to > 0) {
        if ((to-from) % step  == 0) {
            size = (abs(to)-abs(from))/ abs(step);
        } else {
            size = (abs(to)-abs(from))/abs(step) + 1;
        }
    } else {
        if ((to-from) % step  == 0) {
            size = (abs(to)+abs(from))/ abs(step);
        } else {
            size = (abs(to)+abs(from))/abs(step) + 1;
        }
    }
    *outputArray = (int *)calloc(size, sizeof(int));
    int j = 0;
    if (step >= 0) {
        for (int i = from; i < to; i += step, j++) {
            (*outputArray)[j] = i;
        }
    } else {
        for (int i = from; i > to; i += step, j++) {
            (*outputArray)[j] = i;
        }
    }
    return size;
}
