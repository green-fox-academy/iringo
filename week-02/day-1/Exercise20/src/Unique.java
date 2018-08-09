import java.util.Arrays;
import java.util.*;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        int[] unique = new int[] {1, 11, 34, 11, 52, 61, 1, 34};
        sort(unique);
        System.out.println(Arrays.toString(unique));
    }

    public static int[] sort (int[] array) {

        Arrays.sort(array);

        int counter = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                

}