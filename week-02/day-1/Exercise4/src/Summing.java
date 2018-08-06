//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class Summing {

    public static void main (String [] args) {
    int a = 8;
    System.out.println(sum(a));
    }

    public static int sum (int a) {

        int finalSum = 0;
        for (int i = 0; i <= a; i++) {
            finalSum += i;
        }
        return (finalSum);
    }

}
