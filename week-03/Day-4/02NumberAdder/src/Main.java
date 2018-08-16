public class Main {

    public static void main(String[] args) {

        System.out.println(downCounter(4));

    }

    public static int downCounter(int n) {

        if (n == 1) {
            return 1;
        } else {
            return (downCounter(n - 1) + n);
        }
    }

}
