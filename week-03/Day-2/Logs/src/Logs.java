// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

        System.out.println(ipAddress("logs.txt"));
        System.out.println(getPostRatio(("logs.txt")));
    //27 39
    }

    public static ArrayList<String> ipAddress(String filename) {

        ArrayList<String> outputArray = new ArrayList<String>();
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j++) {
                    outputArray.add(i, lines.get(j).substring(5, 10));
                }
            }
        } catch (IOException e) {
            System.out.println(("No such file."));
        }
        return outputArray;
    }

    public static double getPostRatio(String filename) {

        double postCounter = 0;
        double getCounter = 0;
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(42, 46) == "POST") {
                    postCounter++;
                } else if (lines.get(i).substring(41, 46) == "GET") {
                    getCounter++;
                }
            }
        } catch (IOException e) {
            System.out.println(("No such file."));
        }
        if (postCounter > getCounter) {
            return postCounter / getCounter;
        } else {
            return getCounter / postCounter;
        }
    }
}
