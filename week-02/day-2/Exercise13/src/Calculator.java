import java.util.Scanner;

public class Calculator {

    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression:");
        String userInputOperand = scanner.nextLine();
        System.out.println("Please give me the first number:");
        int operand1 = scanner.nextInt();
        System.out.println("Please give me the second number:");
        int operand2 = scanner.nextInt();
        calculate(userInputOperand, operand1, operand2);

    }

    public static void calculate(String userInputOperand, int a, int b) {

        int output = 0;

        if (userInputOperand.contains("+")) {
            System.out.println(a + b);
        }
        if (userInputOperand.contains("-")) {
            System.out.println(a - b);
        }
        if (userInputOperand.contains("*")) {
            System.out.println(a * b);
        }
        if (userInputOperand.contains("/")) {
            System.out.println(a / b);
        }
        if (userInputOperand.contains("%")) {
            System.out.println(a % b);
        }

    }
}

