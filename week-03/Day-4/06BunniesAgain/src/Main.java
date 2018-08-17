public class Main {

    public static void main(String[] args) {

        System.out.println(bunnyEars(4));
    }

    public static int bunnyEars(int n) {

        if (n == 1) {
            return 2;
        }
        if (n % 2 == 0) {
            return (3 + bunnyEars(n - 1));
        }
        return (2 + bunnyEars(n - 1));

    }
}
