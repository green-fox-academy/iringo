// Write a recursive function that takes one parameter: n and counts down from n.

public class Main {

    public static void main(String[] args) {

        downCounter(8);

    }

    public static int downCounter(int n) {

        if (n == 0) {
            System.out.println(0);
            return 0;
        } else {
            System.out.println(n);
            return (downCounter(n-1));
        }
    }

}
