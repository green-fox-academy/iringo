
import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was


public class DrawSquare {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int userInput = name.nextInt();

        for (int i = 1; i <= userInput; i++) {

            if (i == 1 || i == userInput) {
                for (int j = 1; j <= userInput; j++) {
                    System.out.print("%");
                }
            } else if (i != 1 || i != userInput) {
                System.out.print("%");
                for (int k = 1; k <= (userInput - 2); k++) {
                    System.out.print(" ");
                }
                System.out.print("%");
            }

            System.out.println();
        }


    }
}

