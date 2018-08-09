import java.util.Arrays;

public class Matrix {

    // - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

        public static void main(String[] args) {

            int[][] Array1 = new int[4][4];

            for (int i = 0; i < Array1.length; i++) {
                for (int j = 0; j < Array1.length; j++) {
                    if (Array1[i] == Array1[j]) {
                        Array1[i][j] = 1;
                    }
                }
            }

            for (int i = 0; i < Array1.length; i++) {
                for (int j = 0; j < Array1[i].length; j++) {
                    System.out.print(Array1[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
