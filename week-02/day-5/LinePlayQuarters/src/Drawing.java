import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

        public static void mainDraw(Graphics graphics) {

            int numberOfLines = 14;
            int startingPoint = 20;

            int x = startingPoint;
            int y = startingPoint;
            for (int i = 0; i < numberOfLines; i++) {
                graphics.setColor(new Color(138, 43, 226));
                graphics.drawLine(x + (i * 10), 0, WIDTH/2, y + (i * 10));
            }

            x = startingPoint + WIDTH/2;
            y = 0;
            for (int i = 0; i < numberOfLines; i++) {
                graphics.setColor(new Color(138, 43, 226));
                graphics.drawLine(x + (i * 10), 0, WIDTH, y + (i * 10));
            }

            x = startingPoint;
            y = WIDTH / 2;
            for (int i = 0; i < numberOfLines; i++) {
                graphics.setColor(new Color(138, 43, 226));
                graphics.drawLine(x + (i * 10), WIDTH/2, WIDTH/2, y + (i * 10));
            }

            x = startingPoint + WIDTH/2;
            y = WIDTH / 2;
            for (int i = 0; i < numberOfLines; i++) {
                graphics.setColor(new Color(138, 43, 226));
                graphics.drawLine(x + (i * 10), WIDTH/2, WIDTH, y + (i * 10));
            }

            int a = startingPoint;
            int b = startingPoint;
            for (int j = 0; j < numberOfLines; j++) {
                graphics.setColor(Color.GREEN);
                graphics.drawLine(0, b + (j * 10), a + (j * 10), WIDTH/2);
            }

            a = WIDTH/2;
            b = startingPoint;
            for (int j = 0; j < numberOfLines; j++) {
                graphics.setColor(Color.GREEN);
                graphics.drawLine(a, b + (j * 10), a + (j * 10), WIDTH/2);
            }

            a = startingPoint;
            b = startingPoint + WIDTH/2;
            for (int j = 0; j < numberOfLines; j++) {
                graphics.setColor(Color.green);
                graphics.drawLine(0, b + (j * 10), a + (j * 10), WIDTH );
            }

            a = WIDTH/2;
            b = startingPoint + WIDTH/2;
            for (int j = 0; j < numberOfLines; j++) {
                graphics.setColor(Color.green);
                graphics.drawLine(a, b + (j * 10), a + (j * 10), WIDTH);
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