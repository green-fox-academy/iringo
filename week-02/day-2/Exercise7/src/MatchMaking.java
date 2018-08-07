import java.util.*;

public class MatchMaking {

    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches (ArrayList<String> list1, ArrayList<String> list2) {

        ArrayList<String> matchingList = new ArrayList<String>();

        for (int i = 0; i <= list1.size() - 1; i ++) {
                matchingList.add (list1.get(i) + ", " + list2.get(i));
        }
        if (list1.size() < list2.size()) {
            matchingList.add (list2.get(list2.size()-1));
        }
        return (matchingList);
    }


}
