import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.*;

public class SquareInTheCenter {

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.

        int size = 50;
        //int diagonalHalf = (int) (size * (java.lang.Math.sqrt(2) / 2));
        //int x = WIDTH/2 - diagonalHalf;       This does not work perfectly, probably because I am making from a double an integer.
        //int y = HEIGHT/2 - diagonalHalf;

        int x = (WIDTH / 2) - (size /2);
        int y = (HEIGHT / 2) - (size/2);

        graphics.drawRect(x, y, size, size);

        graphics.setColor(Color.green);
        graphics.drawLine(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.red);
        graphics.drawLine(WIDTH, 0, 0, HEIGHT);

    }

    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}