import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {

        decryption("reversed-order.txt");

    }

    public static void decryption(String filename) {

        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (int i = lines.size() - 1; i >= 0; i--) {
                for (int j = 0; j < lines.get(i).length(); j++) {
                    System.out.print(lines.get(i).charAt(j));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(("No such file."));
        }

    }

}