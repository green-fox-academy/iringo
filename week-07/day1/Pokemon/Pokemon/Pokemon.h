#ifndef Pokemon_h
#define Pokemon_h

typedef enum {
    normal,
    fire,
    water,
    electric,
    grass,
    ice,
    figthing,
    poison,
    ground,
    flying,
    psyhic,
    big,
    rock,
    ghost,
    dragon,
    dark,
    steel,
    fairy
} Type;


typedef struct {
     char name[256];
     int age;
     double strength;
     double speed;
     Type type;
} Pokemon;

int fasterCount (Pokemon* pokemons, int arraySize, int speed);
int typeCount (Pokemon* pokemons, int arraySize, Type type);
Type strongestPokemonType (Pokemon* pokemons, int arraySize, int strength);
double highestStrength (Pokemon* pokemons, int arraySize, Type type);

#endif /* Pokemon_h */
