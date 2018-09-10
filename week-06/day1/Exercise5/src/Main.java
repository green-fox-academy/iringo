import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    // Write a Stream Expression to find the uppercase characters in a string!
    public static void main(String[] args) {
        String string = "almAalmABCEask";
        String upper = string.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char)c))
                .collect(Collectors.joining());
        System.out.println(upper);
    }

}
