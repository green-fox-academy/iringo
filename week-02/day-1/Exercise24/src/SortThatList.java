//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending

//  Example:  System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//    //  should print [5, 9, 12, 24, 34]
//    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//    //  should print [34, 24, 12, 9, 5]

import java.util.*;

public class SortThatList {

    public static void main(String[] args) {

        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));

    }

    public static List<Integer> bubble (int[] inputList){

        Arrays.sort(inputList);
        Arrays.asList(inputList);
        List<Integer> output = new ArrayList<Integer> (Arrays.t(inputList));

        List<Integer> output = new ArrayList<Integer> ()
        return output;
    }


}
