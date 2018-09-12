
#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    
    int km;
    printf("Please specify the km: \n");
    scanf("%d", &km);
    printf("This is %.2f kilometers:\n", km * 0.62);
    
}
