import java.util.Arrays;

public class main {

    public static String glob;
    public static int number;

    public static void main (String [] args) {

       /* int a = 5;
        int b = 6;
        int c = add(a, b);
        int d = add(7, 11);

        for (int i = 0; i < 5; i++) {
            int tmp = add (i,b);
            System.out.println(tmp);
        }

        System.out.println(c);
       System.out.println(d);

       double sum = add(5, 6);
       System.out.println(glob); */

      // int[] intArray = new int[] {5, 6, 8, 1, 0};
       // System.out.println("Size: " + intArray.length);

       // int [] intArray3 = {1, 5, 6, 8}; De célszerűbb a fentit használni.

       /*System.out.println(intArray[2]);

        int[][] twoDimArray = new int[][]{{1,2,3}, {4,5}};
        System.out.println(twoDimArray[0][1]);

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++){
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/

        int [] intArray4 = {8, 9, 5, 3};

        Arrays.sort(intArray4);

        System.out.println(Arrays.toString(intArray4));

        int [] copiedArray4 = Arrays.copyOf(intArray4, 2);
        System.out.println(Arrays.toString(copiedArray4));

        intArray4 [0] = 2;
        System.out.println(copiedArray4[0]);

        // printElement(copiedArray4);

        int[] cop = myCopy(intArray4);
        System.out.println(Arrays.toString(cop));

        doubling(intArray4);
        System.out.println(Arrays.toString(intArray4));

        //System.out.println("Sorted array: ");
        //for (int element: intArray4){
        //    System.out.println(element);
        //}


        //for (int element : intArray4) {
          //  System.out.println(element);
        //}




       //int[] intArray2 = intArray;
       //intArray[2] = 7;

        //System.out.println(Arrays.toString(intArray));

    //}

    /*public static double add(int a, int b) {

        String glob = "alma";

        double sum = a + b;

        return (sum);*/
    }

    //public static void printElement(int[] toBePrinted) {

      //  System.out.println(Arrays.toString(toBePrinted));

    //}

    public static int[] myCopy (int[] toBeCopied) {

        int[] copy = new int[toBeCopied.length];
        for (int i = 0; i < toBeCopied.length; i++) {
            copy[i] = toBeCopied[i]; // * 2 és akkor megduplázom
        }
        return copy;
    }

    public static void doubling (int[] toBeCopied) {


        for (int i = 0; i < toBeCopied.length; i++) {
            toBeCopied[i] = toBeCopied[i] * 2; // * 2 és akkor megduplázom // Nem hozok létre új tömböt, hanem belerakom saját magának a kétszeresét.
        }
    }




}

