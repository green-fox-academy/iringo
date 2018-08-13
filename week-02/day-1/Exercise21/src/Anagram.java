import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        // Create a function named is anagram following your current language's style guide.
        // It should take two strings and return a boolean value depending on whether its an anagram or not.
        String firstWord = "dog";
        String secondWord = "god";
        System.out.println(anagram(firstWord, secondWord));
        ;

    }

    public static boolean anagram(String first, String second) {

        boolean returnValue = true;

        if (first.length() != second.length()) {
            returnValue = false;
        }

        first = first.toLowerCase();
        second = second.toLowerCase();
        char[] sorted1 = first.toCharArray();
        char[] sorted2 = second.toCharArray();
        Arrays.sort(sorted1);
        Arrays.sort(sorted2);

        for (int i = 0; i < sorted1.length; i++) {
            if (sorted1[i] != sorted2[i]) {
                returnValue = false;
            } else {
                returnValue = true;
            }
        }

        return returnValue;
    }


}
