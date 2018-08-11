import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {

        int numberOfLines = 14;
        int canvasDivide = 4;
        int w = WIDTH / (canvasDivide / 2);

        int x1 = 40 / (canvasDivide / 2);
        int y1 = 0;
        int x2 = w;
        int y2 = 20 / (canvasDivide / 2);

        int a1 = 0;
        int b1 = 40 / (canvasDivide / 2);
        int a2 = 20 / (canvasDivide / 2);
        int b2 = w;


        for (int j = 0; j < canvasDivide / 2; j++) {

            for (int l = 0; l < canvasDivide / 2; l++) {

                for (int i = 0; i < numberOfLines; i++) {
                    graphics.setColor(new Color(138, 43, 226));
                    graphics.drawLine(x1, y1, x2, y2);
                    x1 = x1 + 20 / (canvasDivide / 2);
                    y2 = y2 + 20 / (canvasDivide / 2);
                }

                x1 = (40 / (canvasDivide / 2)) + w * (l + 1);
                x2 = WIDTH;
                y2 = 20 / (canvasDivide / 2);
                if (j % 2 != 0){
                    y2 = WIDTH/2 + 20 / (canvasDivide / 2);
                }

                for (int k = 0; k < numberOfLines; k++) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(a1, b1, a2, b2);
                    a2 = a2 + 20 / (canvasDivide / 2);
                    b1 = b1 + 20 / (canvasDivide / 2);
                }
                a1 = a1 + w;
                a2 = (20 / (canvasDivide / 2))+ w * (l+1);
                b2 = w + w;
            }

            w = WIDTH / (canvasDivide/2);
            x1 = 40 / (canvasDivide / 2);
            y1 = w;
            x2 = w;
            y2 = WIDTH/2 + 20;

            a1 = 0;
            b1 = w * (j+1);
            a2 = 20 / (canvasDivide / 2);
            b2 = WIDTH;

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