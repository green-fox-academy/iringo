import java.util.Arrays;

public class Anagram {

    private String word1;
    private String word2;

    public boolean anagram(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        char[] sorted1 = string1.toCharArray();
        char[] sorted2 = string2.toCharArray();
        Arrays.sort(sorted1);
        Arrays.sort(sorted2);

        for (int i = 0; i < sorted1.length; i++) {
            if (sorted1[i] != sorted2[i]) {
                return false;
            }
        }
        return true;

    }

}
