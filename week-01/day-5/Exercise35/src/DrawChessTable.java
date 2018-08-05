import java.util.Scanner;

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class DrawChessTable {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int userInput = name.nextInt();

        for (int i = 1; i <= userInput; i++) {

            if (i % 2 != 0) {

                for (int j = 1; j <= userInput; j++) {

                    if (j % 2 != 0) {
                        System.out.print("%");
                    } else System.out.print(" ");
                }

            } else if (i % 2 == 0) {

                for (int j = 1; j <= userInput; j++) {

                    if (j % 2 == 0) {
                        System.out.print("%");
                    } else System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
