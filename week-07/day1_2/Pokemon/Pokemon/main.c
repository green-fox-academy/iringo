#include <stdio.h>
#include "Pokemon.h"

int main()
{
    Pokemon pokemon1;
    Pokemon pokemon2;
    Pokemon pokemon3;
    pokemon1.type = water;
    pokemon2.type = water;
    pokemon3.type = fire;
    pokemon1.speed = 1.0;
    pokemon2.speed = 5.0;
    pokemon3.speed = 6.0;
    pokemon1.strength = 10.0;
    pokemon2.strength = 5.0;
    pokemon3.strength = 3.0;
    
    Pokemon pokemons[] = {pokemon1, pokemon2, pokemon3};
    int pokemonsSize = sizeof(pokemons) / sizeof(pokemons[0]);
    
    double speed = 5.5;
    int strength = 0;
    Type type = water;
    printf("%d pokemon are faster than %.2f\n", fasterCount(pokemons, pokemonsSize, speed));
    printf("%d pokemons are type %d\n", typeCount(pokemons, pokemonsSize, type), type);
    printf("The type of the strongest pokemon is: %d\n", strongestPokemonType(pokemons, pokemonsSize, strength));
    printf("The highest strength among type %d is: %.2f\n", type, highestStrength(pokemons, pokemonsSize, type));
}
