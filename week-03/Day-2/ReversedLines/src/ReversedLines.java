import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {

        decryption("reversed-lines.txt");

    }

    public static void decryption(String filename) {

        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = lines.get(i).length() - 1; j >= 0; j--) {
                    System.out.print(lines.get(i).charAt(j));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(("No such file."));
        }

    }
}