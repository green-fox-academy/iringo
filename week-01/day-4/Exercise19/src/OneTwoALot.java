import java.util.Scanner;

public class OneTwoALot {

    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Write down a number: ");
        int userInput = name.nextInt();

        if (userInput <= 0) {
            System.out.println("Not enough");
        }
        if (userInput == 1) {
            System.out.println("One");
        }
        if (userInput == 2) {
            System.out.println("Two");
        }

        if (userInput > 2) {
            System.out.println("A lot");
        }

    }

}
