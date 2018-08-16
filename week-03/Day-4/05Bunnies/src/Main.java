// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Main {

    public static void main(String[] args) {

    }

    public static int earsOfBunnies (int n) {

        if (n == 0) {
            return 1;
        } else {
            return ((earsOfBunnies(n-1)));
        }

    }
}
