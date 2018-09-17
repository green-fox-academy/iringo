#include <stdio.h>
#include "Sandwich.h"

/* Create a sandwich struct
 It should store:
 - name
 - price (float)
 - weight (float)
 Create a function which takes two parameters and returns the price of your order.
 The parameters should be:
 - a sandwich struct
 - and an integer that represents how many sandwiches you want to order */

int main()
{
    Sandwich sandwich1;
    sandwich1.price = 20.5;
    printf("The amount you have to pay for the sandwiches 1 is: %.2f", calculatePrice(sandwich1, 5));
    return 0;
}






