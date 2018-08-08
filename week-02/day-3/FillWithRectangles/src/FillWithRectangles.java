import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.*;

public class FillWithRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random()*300);
            int y = (int) (Math.random()*300);
            int width = (int) (Math.random()*200);
            int height = (int) (Math.random()*200);
            graphics.setColor(
                    new Color(
                            (int) (Math.random()*256),
                            (int) (Math.random()*256),
                            (int) (Math.random()*256)));
            graphics.fillRect(x, y, width, height);
        }

    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}