import java.util.Scanner;

public class GuessTheNumber {

    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        int number = 8;
        int k = 0;
        int i =2;

        do  {

            System.out.println("Guess the number: ");

            int userInput = name.nextInt();

            if (userInput == number) {
                System.out.println("You found the number: " + userInput);
                k = i;

            } else if (userInput < number) {
                System.out.println("The stored number is higher!");
                i++;

            } else if (userInput > number) {
                System.out.println("The stored number is lower!");
                i++;
            }

        } while (i != k);


    }






}
