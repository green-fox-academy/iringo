public class Fibonacci {

    private int number;

    public int fibonacciCalculator(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        } else {
            return fibonacciCalculator(number - 1) + fibonacciCalculator(number - 2);
        }
    }

}