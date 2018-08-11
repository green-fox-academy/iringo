import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.*;

public class Drawing {

    public static void mainDraw(Graphics graphics) {

        int size = 10;
        int height = 10;
        int a = 30;
        int b = HEIGHT - 80;
        int counter = 21;

        for (int j = 1; j < 22; j++) {

            for (int i = 0; i < counter; i++) {
                drawTriangle(graphics, a, b, size, height);
                a = a + size;
            }

            a = 30 + (size/2) * j;
            b = HEIGHT - 80 - size * j;
            counter --;
        }
        
    }
    
    public static void drawTriangle (Graphics graphics, int x, int y, int size, int height) {

        graphics.drawLine(x, y, x - size/2, y + size);
        graphics.drawLine(x - size/2, y + size, x + size/2, y + size);
        graphics.drawLine(x + size/2, y + size, x, y);
        
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