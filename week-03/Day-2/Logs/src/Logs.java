// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

    }

    public static Array[] ipAddress (String filename) {
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            Array[] outputArray = new Array[lines.size()];
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.toString().substring(25, 35));
            }
        } catch (Exception e) {
            System.out.println(("No such file."));
        }
        return
    }

    public static int getPostRatio (String filename) {

    }

}
