// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;


public class Matrix {

    public static void main(String[] args) {

        int[][] Array= new int[4][4];

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j< Array.length; j++) {
                if (Array[i] == Array [j]) {
                    Array[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {

                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
