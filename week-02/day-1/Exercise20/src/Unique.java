import java.util.Arrays;
import java.util.*;

public class Unique {

    public static void main(String[] args) {

        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));

    }

    private static String unique(int[] list) {

        String sorted = "";
        for (int i = 0; i < list.length; i++) {
            String numberAsString = String.valueOf(list[i]);
            if (!sorted.contains(numberAsString)) {
                sorted += numberAsString;
                sorted += " ";
            }

        }
        return sorted;
    }


}