import java.util.Scanner;


public class DrawPyramid {

    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int userInput = name.nextInt();


        for (int i = 1; i <= userInput; i ++) {

           // for (int k = 1; k < ) {

                System.out.print(" ");

            // }

            for (int j= 1; j <= ((i*2) -1); j++) {

                System.out.print("*");
            }

            System.out.println();


        }


    }


}
