import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int x = 0;
        int y = 0;
        int size = 32;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                x = j * size;
                y = i * size;
                if ( (i % 2) == (j % 2) )
                    graphics.setColor(Color.WHITE);
                else
                    graphics.setColor(Color.BLACK);
                graphics.fillRect(x, y, size, size);
            }
        }
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