// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Main {

    public static void main(String[] args) {

        System.out.println(earsOfBunnies(16));

    }

    public static int earsOfBunnies(int n) {

        if (n == 1) {
            return 2;
        } else {
            return 2 + earsOfBunnies(n - 1);
        }

    }
}
