import java.util.HashMap;
import java.util.Map;

// Create 5 trees
//Store the data of them in variables in your program
//for every tree the program should store its'
//type
//leaf color
//age
//sex
//you can use just variables, or lists and/or maps

public class Tree {

    public static void main(String[] args) {

        Map <String, String> treeLeafColors = new HashMap<>();

        String type = "Oak";
        String leafColor = "green";
        int age = 56;
        String sex = "neutral";

        treeLeafColors.put(type, leafColor);
        treeLeafColors.put("apple", "green");

        System.out.println("The color of the apple trees:" + treeLeafColors.get("apple"));


    }
}
