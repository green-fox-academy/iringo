import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int userInput = name.nextInt();


        if (userInput % 2 == 1) {

            for (int i = 1; i <= (userInput + 1) / 2; i++) {

                double k = (userInput / 2) - i + 1;

                for (int l = 1; l <= k; l++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= Math.abs(((i * 2) - 1)); j++) {

                    System.out.print("*");
                }

                System.out.println();

            }

            for (int m = 1; m <= (userInput - 1) / 2; m++) {

                for (int o = 1;  o <= m; o++) {
                    System.out.print(" ");
                }

                for (int p = 1; p <= userInput - (m * 2); p++) {
                    System.out.print("*");
                }

                System.out.println();

            }

        }

        if (userInput % 2 == 0) {

            for (int i = 1; i <= userInput / 2; i++) {

                double k = (userInput / 2) - i;

                for (int l = 1; l <= k; l++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= Math.abs(((i * 2) - 1)); j++) {

                    System.out.print("*");
                }

                System.out.println();

            }

            for (int m = 0; m <= userInput / 2; m++) {

                for (int o = 1;  o <= m; o++) {
                    System.out.print(" ");
                }

                for (int p = 1; p <= (userInput - (m * 2)) -1; p++) {
                    System.out.print("*");
                }

                System.out.println();

            }

        }

    }


}
