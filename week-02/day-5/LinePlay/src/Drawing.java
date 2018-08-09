import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {

        int numberOfLines = 14;
        int x1 = 40;
        int y2 = 20;

        for (int i = 0; i < numberOfLines; i++) {
            graphics.setColor(new Color(138,43,226));
            graphics.drawLine(x1, 0, WIDTH, y2);
            x1 = x1 + 20;
            y2 = y2 + 20;
        }

        int b1 = 40;
        int a2 = 20;

        for (int j = 0; j < numberOfLines; j++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, b1, a2, WIDTH);
            b1 = b1 + 20;
            a2 = a2 + 20;

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