import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class Drawing {

        public static void mainDraw(Graphics graphics) {
            // Fill the canvas with a checkerboard pattern.

            int size = 32;
            int x = 0;
            int y = 0;

            for (int j = 0; j < 10; j++){
                for (int i = 0; i < 10; i++) {
                    if ((j % 2 == 0) && (i % 2 == 0)){
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect(x, y, size, size);
                    } else if ((j % 2 != 0) && (i % 2 != 0)) {
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect(x, y, size, size);
                    } else {
                        graphics.setColor(Color.white);
                        graphics.drawRect(x, y, size, size);
                    }
                    x = x + size;
                }
                x = 0;
                y = y + size;
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
