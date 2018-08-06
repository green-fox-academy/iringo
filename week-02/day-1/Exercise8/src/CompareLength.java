// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

import java.util.Arrays;

public class CompareLength {

    public static void main (String[] args) {

        int[] p1 = new int[] {1, 2, 3};
        int[] p2 = new int[] {4, 5};

        if (p1.length < p2.length) {
            System.out.println(Arrays.toString(p2));
        } else {
            System.out.println(Arrays.toString(p1));
        }
    }
}
