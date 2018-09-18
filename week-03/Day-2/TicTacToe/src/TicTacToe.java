import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        /*System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw*/

        ticTacResult("win-o.txt");
    }

    public static void ticTacResult(String filename) {


        String [] ticTacArray = new String[3];
        String [][] ticTacArrayFinal = new String[3][3];
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            for (int i = 0; i < lines.size(); i++) {
                ticTacArray[i] = lines.get(i);
            }
            int counter = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    ticTacArrayFinal[i][j] = ticTacArray[counter];
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println(("No such file."));
        }

    }
}