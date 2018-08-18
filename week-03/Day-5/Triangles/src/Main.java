import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JComponent {

    private static int MAX_DEPTH = 0;

    private static int size = 500;
    private static int height = (int) (size * (Math.sqrt(3) / 2));


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics = (Graphics2D) g;

        int [] size0Array = {size/2, size - size, size};
        int [] height0tArray = {height, height - height, height - height};

        drawTriangle(graphics, size0Array, height0tArray, 0);

    }
        private void drawTriangle (Graphics2D g, int [] sizeArray, int [] heightArray, int depth) {

            if (depth > MAX_DEPTH) {
                return;
            }

            g.drawPolygon(sizeArray, heightArray, 3);

            int [] x1Points = {size/2, size/4, size * 3/4};
            int [] y1Points = {height - height, height/2, height/2};
            drawTriangle(g, x1Points, y1Points, depth + 1);

            int [] x2Points = {size/4, size/8, size * 3/8};
            int [] y2Points = {height - height, height * 1/4, height * 1/4 };
            drawTriangle(g, x2Points, y2Points, depth + 1);

            int [] x3Points = {size * 6/8, size * 5/8, size * 7/8};
            int [] y3Points = {height - height, height * 1/4, height * 1/4};
            drawTriangle(g, x3Points, y3Points, depth + 1);

            int [] x4Points = {size/2, size * 3/8, size * 5/8};
            int [] y4Points = {height - height/2, height - height/4, height - height/4};
            drawTriangle(g, x4Points, y4Points, depth + 1);

        }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Main main = new Main();
        main.setPreferredSize(new Dimension(600, 600));

        frame.getContentPane().add(main);

        /*Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MAX_DEPTH++;
                main.repaint();
            }
        });

        timer.start();*/

        frame.pack();
        frame.setVisible(true);
    }

}



