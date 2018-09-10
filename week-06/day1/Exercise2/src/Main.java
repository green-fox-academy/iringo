import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    // Write a Stream Expression to get the average value of the odd numbers from the following array:

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        double stream = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
        System.out.println(stream);

    }

}
