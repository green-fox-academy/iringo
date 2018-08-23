import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    private String string;

    public void countLetter(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!map.keySet().contains(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch)-1);
            }
        }
        for (Map.Entry<Character, Integer> m: map.entrySet()) {
            System.out.println(m);
        }
    }

}
