// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class Main {

    public static void main(String[] args) {

        String inputWord = "sdlyxxxkjdklsfoiwexxx";
        System.out.println(replaceString(inputWord));
    }

    public static String replaceString (String inputword) {

        inputword.toLowerCase();

        if (!inputword.contains("x")) {
            return inputword;
        } else {
            return replaceString(inputword.replaceFirst("x", "y"));
        }

    }

}
