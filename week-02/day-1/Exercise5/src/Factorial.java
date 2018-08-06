//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial {

    public static void main (String[] args) {

    int input = 5;
    System.out.println(factorio(input));

    }

    public static int factorio (int a) {

        int fact = 1;
        for (int i = 1; i <= a; i ++) {
            fact = fact * i;
        }
        return (fact);
    }

}
