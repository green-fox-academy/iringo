import java.lang.*;
import java.io.*;
import java.util.*;

public class Reverse {

    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        StringBuilder newstring = new StringBuilder();
        newstring.append(reversed);
        newstring = newstring.reverse();
        System.out.println(newstring);


        //System.out.print(reverse(reversed));
    }

    //public static String reverse (String s1) {

        //String reverse = "";
        //for (int i = s1.length()-1; i>= 0; i--) {
            //reverse = reverse + s1.charAt(i);
       // }
        //return(reverse);
    //}

}
