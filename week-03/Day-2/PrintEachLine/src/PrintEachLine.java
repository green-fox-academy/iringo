import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

// Write a program that opens a file called "my-file.txt", then prints
// each of the lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"

public class PrintEachLine {

    public static void main(String[] args) {

        // 1. Solution
        try {
            Path filePath = Paths.get("my-file.rtf");
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (Exception e) {
            System.out.println("Unable to read the file: my-file.rtf");
        }

        // 2. Solution
        try {
            File file = new File("my-file.rtf");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.next());
            }
        } catch (Exception e) {
            System.out.println("Unable to read the file: my-file.rtf");
        }

    }

}

