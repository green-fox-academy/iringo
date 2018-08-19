import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a game for guessing numbers. Please define the range in what you would like to guess (1 - 100)?" + "\n" + "PLease enter the lower end of the range: ");
        int range1 = scanner.nextInt();
        System.out.println("Please enter the higher end of the range: ");
        int range2 = scanner.nextInt();

        int randomNumber = (int) (Math.random() * (range2 - range1)) + range1;
        int guess = -1;
        int life = 5;

        while (life > 0) {
            System.out.println("Type in your guess: ");
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                life--;
                System.out.println("Too low." + "You have " + life + " lives left.");
            } else if (guess > randomNumber) {
                life--;
                System.out.println("Too high." + "You have " + life + " lives left.");
            } else if (guess == randomNumber) {
                System.out.println("Congratulations. You won!");
            }
        }

        if (life == 0) {
            System.out.println("Game over! These are not the numbers you were looking for!");
        }

    }
}
