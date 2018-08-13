import java.util.ArrayList;
import java.util.Arrays;

// Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.

public class Palindrome {

    public static void main(String[] args) {

        String originalWord = "123";
        System.out.println(createPalindrome(originalWord));

    }

    public static String createPalindrome (String input) {

        char[] word = input.toCharArray();
        char[] temp = new char[input.length()];
        int j = 0;
        for (int i = word.length-1; i >= 0; i--) {
                temp[j] = word[i];
                j++;
        }
        String output1 = Arrays.toString(temp);
        String output = input + output1;

        return output;
    }
}
