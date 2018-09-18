#include "Pokemon.h"

int fasterCount (Pokemon* pokemons, int arraySize, int speed)
{
    int counter = 0;
    for (int i = 0; i < arraySize; i++) {
        if (pokemons[i].speed > speed) {
            counter++;
        }
    }
    return counter;
}

int typeCount (Pokemon* pokemons, int arraySize, Type type)
{
    int counter = 0;
    for (int i = 0; i < arraySize; i++) {
        if (pokemons[i].type == type) {
            counter++;
        }
    }
    return counter;
}

Type strongestPokemonType (Pokemon* pokemons, int arraySize, int strength)
{
    int highestStrength = 0;
    for (int i = 0; i < arraySize; i++) {
        if (pokemons[i].strength > highestStrength) {
            highestStrength = pokemons[i].strength;
        }
    }
    for (int i = 0; i < arraySize; i++){
        if (pokemons[i].strength == highestStrength) {
            return pokemons[i].type;
        }
    }
    return 0;
}

double highestStrength (Pokemon* pokemons, int arraySize, Type type)
{
    double highestStrength = 0;
    for (int i = 0; i < arraySize; i++) {
        if (pokemons[i].type == type) {
            if (pokemons[i].strength > highestStrength) {
                highestStrength = pokemons[i].strength;
            }
        }
    }
    return highestStrength;
}
