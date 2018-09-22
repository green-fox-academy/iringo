#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "Calculator.h"

void printUsage()
{
    printf("\t\tCLI Calculator\n====================================\n");
    printf("usage: [number] [operation] [number]\nCommands:\n");
    printf("\n");
    printf("+\tsummation\n-\t\tsubtraction\n*\t\tmultiplication\n/\t\tdivision\n%%\t\tdivision with remainder\n^\t\tsquaring\n<\t\tsquare root\n");
    printf("log\t\tlogarithm\nbinto\tbinary to hex or dec\nhexto\thexadecimal to bin or dec\ndecto\tdecimal to bin or hex\n");
    printf("====================================\n");
    printf("exit\texiting from the program\nclear\tclear the screen\nhelp\tprint usage\n");
    printf("====================================\nHit enter to start!\n");
    printf("====================================\n");
}

void addNumbers (float a, float b)
{
    float result = a + b;
    set_cursor_pos(a, b, result);
}

void set_cursor_pos(float x, float y, float result)
{
    printf("\033[%f;%fH", y+1, x+1);
}
