// Write a recursive function that takes one parameter: n and counts down from n.

public class Main {

    public static void main(String[] args) {

        System.out.println(recursive(5));

    }

    public static int recursive(int n) {

        if (n == 1) {
            return 1;
        } else {
            return (recursive(n - 1) + n);
        }
    }

}
