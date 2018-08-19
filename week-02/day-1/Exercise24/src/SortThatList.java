//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending

//  Example:  System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//    //  should print [5, 9, 12, 24, 34]
//    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//    //  should print [34, 24, 12, 9, 5]

import java.util.*;
import java.util.Arrays;

public class SortThatList {

    public static void main(String[] args) {

        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        //System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]


        Integer[] inputList = new Integer[]{34, 12, 24, 9, 5};
        boolean input = true;
        bubble(new int[]{34, 12, 24, 9, 5});
        advancedBubble(inputList, input);

    }

    public static void bubble(int[] inputList) {

        Arrays.sort(inputList);
        System.out.println(Arrays.toString(inputList));

    }

    public static void advancedBubble(Integer[] inputList, boolean input) {

        if (input == true) {
            Arrays.sort(inputList, Collections.reverseOrder());
        }
        System.out.println(Arrays.toString(inputList));
    }

}
