import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner input = new Scanner(System.in);

        System.out.println("Please add 5 integer numbers: ");
        int userInput1 = input.nextInt();
        int userInput2 = input.nextInt();
        int userInput3 = input.nextInt();
        int userInput4 = input.nextInt();
        int userInput5 = input.nextInt();

        int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        int average = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5;

        System.out.println("Sum: " + sum + "," + " Average: " + average);

    }


}
