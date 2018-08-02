import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        Scanner name = new Scanner(System.in);

        System.out.println("Write down two numbers: ");
        int userInput1 = name.nextInt();
        int userInput2 = name.nextInt();

        if (userInput1 > userInput2) {
            System.out.println(userInput1);
        }
        else {
            System.out.println(userInput2);
        }
    }


}


