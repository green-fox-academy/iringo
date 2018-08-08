import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

    int inputSize = 300;
    String[] Colors = new String[] {"Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"};

        for (int i = 0; i < 7; i++) {
            colouredSquare(inputSize, );
            inputSize = inputSize - 30;
        }

    }

    public static void colouredSquare (Graphics graphics, int size, String[]Colors) {

        for (int i = 0; i < 6; i++) {
            graphics.setColor(Color.Colors[i]);

        }
        graphics.setColor();
        graphics.drawRect(WIDTH/2 - size/2, HEIGHT/2 - size/2, size, size);

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