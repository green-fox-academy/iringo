#include "Sandwich.h"

float calculatePrice (Sandwich sandwich, int amount)
{
    float finalPrice = sandwich.price * amount;
    return finalPrice;
}
