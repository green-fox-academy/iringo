import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner name = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int userInput = name.nextInt();
        int [] array = new int[userInput];
        int sum = 0;

        for (int i = 0; i < userInput; i++) {
            System.out.println("Please give me a number: ");
            int num = name.nextInt();
            sum = sum + num;
        }

        System.out.print("Sum: " + sum + ",");
        int average = sum / userInput;
        System.out.print(" Average: " + average);

    }

}
