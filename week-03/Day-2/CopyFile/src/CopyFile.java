// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

    public static void main(String[] args) {

        System.out.println(copy("my-file.txt", "anotherfile.txt"));

    }

    public static boolean copy (String filename1, String filename2){

        boolean output = true;
        try{
            Files.copy(Paths.get(filename1), Paths.get(filename2));
        } catch (Exception e) {
            output = false;
        }
        return output;

    }
}
