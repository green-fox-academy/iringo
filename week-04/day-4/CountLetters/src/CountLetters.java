import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public static void main(String[] args) {
        Map<Character, Integer> mapp = new HashMap<>();
        mapp =countLetter("letters");
        System.out.println(mapp);
    }

    private String string;

    public static HashMap<Character, Integer> countLetter(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!map.keySet().contains(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch)+1);
            }
        }
        for (Map.Entry<Character, Integer> m: map.entrySet()) {
            System.out.println(m);
        }
        return (HashMap<Character, Integer>) map;
    }

}
