#include <stdio.h>
#include <stdint.h>
#include "Computer.h"

// Use the Computer struct, give values to the fields and print them out in the main!
// Use the Notebook struct, give values to the fields and print them out in the main!

int main()
{
    struct Computer computer1;
    computer1.cpu_speed_GHz = 6.7;
    computer1.ram_size_GB = 64;
    computer1.bits = 64;
    
    printf("The computer's values: CPU: %.2f, Ram: %d, Bits: %d\n", computer1.cpu_speed_GHz, computer1.ram_size_GB, computer1.bits);
    
    Notebook notebook1;
    notebook1.cpu_speed_GHz = 4.5;
    notebook1.ram_size_GB = 32;
    notebook1.bits = 32;
    
    printf("The notebook's values: CPU: %.2f, Ram: %d, Bits: %d\n", notebook1.cpu_speed_GHz, notebook1.ram_size_GB, notebook1.bits);
}
