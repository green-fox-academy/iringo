#include <stdio.h>

int main(int argc, const char * argv[]) {
    /*
     Create a program which can tell how to pay an exact amount of money.
     You can use all the available vaild paper and coin which is in use
     right now in Hungary.
     For example 45670 Ft, is the amount (store this as an integer)
     and the output should be:
     2-20000Ft
     1-5000Ft
     1-500Ft
     1-100Ft
     1-50Ft
     1-20Ft
     */
    
    /*
     Take care of the rounding (when giving back 5 coins):
     1, 2 - 0 down
     3, 4 - 5 up
     6, 7 - 5 down
     8, 9 - 0 up
     */
    
    int amount_of_money = 45670;
    
    int numberOfTwentyThousand = amount_of_money / 20000;
    if (numberOfTwentyThousand >0) {
        printf("%d-20000Ft\n", numberOfTwentyThousand);
    }
    amount_of_money -= numberOfTwentyThousand  * 20000;
    int numberOfTenThousand = amount_of_money / 10000;
    if (numberOfTenThousand > 0) {
        printf("%d-10000Ft\n", numberOfTenThousand);
    }
    amount_of_money -= numberOfTenThousand * 10000;
    int numberOfFiveThousand = amount_of_money / 5000;
    if (numberOfFiveThousand > 0) {
        printf("%d-5000Ft\n", numberOfFiveThousand);
    }
    amount_of_money -= numberOfFiveThousand * 5000;
    int numberOfTwoThousand = amount_of_money / 2000;
    if (numberOfTwoThousand > 0) {
        printf("%d-2000Ft\n", numberOfTwoThousand);
    }
    amount_of_money -= numberOfTwoThousand * 2000;
    int numberOfOneThousand = amount_of_money / 1000;
    if (numberOfOneThousand > 0) {
        printf("%d-1000Ft\n", numberOfOneThousand);
    }
    amount_of_money -= numberOfOneThousand * 1000;
    int numberOfFiveHundred = amount_of_money / 500;
    if (numberOfFiveHundred > 0) {
       printf("%d-500Ft\n", numberOfFiveHundred);
    }
    amount_of_money -= numberOfFiveHundred * 500;
    int numberOfTwoHundred = amount_of_money / 200;
    if (numberOfTwoHundred) {
         printf("%d-200Ft\n", numberOfTwoHundred);
    }
    amount_of_money -= numberOfTwoHundred * 200;
    int numberOfOneHundred = amount_of_money / 100;
    if (numberOfOneHundred > 0) {
        printf("%d-100Ft\n", numberOfOneHundred);
    }
    amount_of_money -= numberOfOneHundred * 100;
    int numberOfFifty = amount_of_money / 50;
    if (numberOfFifty > 0) {
        printf("%d-50Ft\n", numberOfFifty);
    }
    amount_of_money -= numberOfFifty * 50;
    int numberOfTwenty = amount_of_money / 20;
    if (numberOfTwenty > 0) {
        printf("%d-20Ft\n", numberOfTwenty);
    }
    amount_of_money -= numberOfTwenty * 20;
    int numberOfTen = amount_of_money / 10;
    if (numberOfTen > 0) {
         printf("%d-10Ft\n", numberOfTen);
    }
    amount_of_money -= numberOfTen * 10;
    int numberOfFive = amount_of_money / 5;
    amount_of_money -= numberOfFive * 5;
    if (amount_of_money == 3 || amount_of_money == 4) {
        numberOfFive++;
    }
    if (numberOfFive > 0) {
         printf("%d-5Ft\n", numberOfFive);
    }
}
