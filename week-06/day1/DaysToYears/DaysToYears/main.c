#include <stdio.h>

int main(int argc, const char * argv[]) {
    /*
     Create a program which converts days to years, months, weeks and days
     to keep it simple we say every year is 365 days long, every month is 30 days
     */
    
    int numberOfDaysToConvert;
    printf("How many days do you want to convert? \n");
    scanf("%d", &numberOfDaysToConvert);
    
    int numberOfYears = numberOfDaysToConvert / 365;
    numberOfDaysToConvert -= (numberOfYears * 365);
    int numberOfMonths = numberOfDaysToConvert / 30;
    numberOfDaysToConvert -= numberOfMonths * 30;
    int numberOfWeeks = numberOfDaysToConvert / 7;
    int numberOfDays = numberOfDaysToConvert - numberOfWeeks * 7;
    
    printf("The number of years: %d, months: %d, weeks: %d, days is: %d.\n", numberOfYears, numberOfMonths, numberOfWeeks, numberOfDays);
}
