// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class Main {

    public static void main(String[] args) {

     String inputWord = "lksdjfdslknvxm";

    }

    public static String deleteXFromString (String inputWord, int i) {

        if ( inputWord.length() == 0) {
            return inputWord;
        } else {
            return deleteXFromString (inputWord.deleteCharAt(i, i);
        }

    }


}
