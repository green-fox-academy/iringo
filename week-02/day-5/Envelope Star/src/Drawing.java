import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {

        int numberOfLines = 20;
        int x = WIDTH/2;
        int y = 20;
        int x1 = WIDTH/2;
        int x2 = WIDTH/2;

        for (int i = 1; i < numberOfLines; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(x, y, x1, WIDTH/2);
            graphics.drawLine(x, y, x2, WIDTH/2);
            y = y + ((WIDTH/2)/numberOfLines);
            x1 = x1 - ((WIDTH/2)/numberOfLines);
            x2 = x2 + ((WIDTH/2)/numberOfLines);
        }

        int a = WIDTH/2;
        int b = WIDTH - 20;
        int a1 = WIDTH/2;
        int a2 = WIDTH/2;

        for (int j = 0; j < numberOfLines; j++) {
            graphics.setColor(Color.green);
            graphics.drawLine(a, b, a1, WIDTH/2);
            graphics.drawLine(a, b, a2, WIDTH/2);
            b = b - ((WIDTH/2)/numberOfLines);
            a1 = a1 - (WIDTH/2)/numberOfLines;
            a2 = a2 + (WIDTH/2)/numberOfLines;

        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 342;

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
