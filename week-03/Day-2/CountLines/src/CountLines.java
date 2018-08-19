// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.File;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        numberOfLines("my-file.txt");

    }

    public static void numberOfLines(String filename) {

        int counter = 0;
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                counter++;
            }
            System.out.println("The number of lines is: " + counter);
        } catch (Exception e) {
            System.out.println("0");
        }

    }

}
