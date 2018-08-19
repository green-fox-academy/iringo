import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the number you wish to analyze: ");
        int userInput = scanner.nextInt();
        int original = userInput;
        String numberToString = Integer.toString(userInput);
        int sum = 0;

        for (int i = 0; i < numberToString.length(); i++) {
            sum += Math.pow(userInput % 10, 4);
            userInput = userInput / 10;
        }

        if (sum == original) {
            System.out.println("The " + original + " is an Armstrong number.");
        } else {
            System.out.println("The " + original + " is not an Armstrong number.");
        }

    }

}
