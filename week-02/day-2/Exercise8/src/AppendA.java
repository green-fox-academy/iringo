import java.util.*;


public class AppendA {

    public static void main(String[] args) {

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        System.out.println(appendA(far));

    }

    public static List appendA (List<String> list) {

        List<String> outcome = new ArrayList<String>();
        for (int i = 0; i <= list.size()-1; i++) {
            outcome.add(list.get(i) + "a");
        }
        return (outcome);

    }

}
