import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"


public class WriteSIngleLine {

    public static void main(String[] args) {

        try {
            Path path = Paths.get("my-file.txt");
            List<String> lines = new ArrayList<>();
            for (int i = 0; i < 1; i++) {
                lines.add("Iringo");
            }
            Files.write(path, lines);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}
