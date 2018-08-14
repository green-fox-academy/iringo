// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int divisor = scanner.nextInt();
        divide(divisor);

    }

    public static void divide(int divisor) {

        int number = 10;
        try {
            number = number / divisor;
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }

    }
}
