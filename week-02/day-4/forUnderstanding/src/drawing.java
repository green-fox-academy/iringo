public class drawing {


    public static void main(String[] args) {

        int[][] points =new int[][] {{10, 10}, {290,  10}, {290, 290}, {10, 290}};

        int x = 0;
        int y = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 1; j < points[i].length; j++) {
                x = points[i][j];
                y = points[i+1][j+1];
            }

        }
    }
}
