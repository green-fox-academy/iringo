#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "Calculator.h"

int main(int argc, const char * argv[]) {
    printUsage();
    if (strcmp(argv[2], "+") == 0) {
        addNumbers (atoi(argv[1]), atoi(argv[3]));
    }
}
