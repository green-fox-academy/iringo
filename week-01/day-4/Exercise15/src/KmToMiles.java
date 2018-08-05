import java.util.Scanner;

public class KmToMiles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number: ");
        double kilometers = scanner.nextInt();

        double miles = kilometers * 0.6214;
        System.out.println(kilometers + "kilometer is: "+ miles + "mile");

    }

}
