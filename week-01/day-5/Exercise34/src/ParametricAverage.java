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


        for (int i= 0; i < array.length; i++) {

            System.out.println("Enter the number you wish to work with: ");
            int number = name.nextInt();
            array[i] = number;

        }

        for (int row: array){
            System.out.print(row);
        }

    }

}
