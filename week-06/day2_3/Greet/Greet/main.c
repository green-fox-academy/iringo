// - Create a char array variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

#include <stdio.h>
#include <stdlib.h>

void greet(char whomToGreet[]);

int main(int argc, const char * argv[]) {
   
    char al[] = "Greenfox";
    greet(al);
}

void greet (char whomToGreet[])
{
    printf("Greetings dear, %s!\n", whomToGreet);
}
