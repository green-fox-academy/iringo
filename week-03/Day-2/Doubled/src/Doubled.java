import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        decryption("duplicated-chars.txt");
    }

    public static void decryption(String filename) {

        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j += 2) {
                    System.out.print(lines.get(i).charAt(j));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(("No such file."));
        }

    }
}