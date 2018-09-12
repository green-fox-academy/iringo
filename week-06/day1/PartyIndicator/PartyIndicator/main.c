
#include <stdio.h>

int main(int argc, const char * argv[]) {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    //
    // It should print: Quite cool party!
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    
    int numberOfGirls;
    int numberOfBoys;
    printf("Please specify the number of girls and boys: \n");
    scanf("%d", &numberOfGirls);
    scanf("%d", &numberOfBoys);
    if (numberOfBoys == numberOfGirls && numberOfBoys + numberOfGirls >= 20) {
        printf("The party is excellent! \n");
    } else if (numberOfBoys + numberOfGirls >= 20 && numberOfBoys / numberOfGirls != 1) {
        printf("Quite cool party! \n");
    } else if (numberOfBoys + numberOfGirls < 20 && numberOfGirls > 0) {
        printf("Average party... \n");
    } else if (numberOfGirls == 0) {
         printf("Sausage party! \n");
    }
   
}
