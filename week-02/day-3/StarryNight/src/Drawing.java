import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        Color[] colors = {new Color (220,220,220), new Color (211,211,211), new Color (192,192,192), new Color (169,169,169), new Color (128,128,128), new Color (105,105,105), new Color (119,136,153), new Color (112,128,144), new Color(47,79,79)};

        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        for (int i = 0; i < colors.length -1 ; i++) {
            drawSquares(graphics, colors[i]);
        }

    }

    public static void drawSquares (Graphics graphics, Color color){
        graphics.setColor(color);
        for (int i = 0; i < 40 ; i++) {
            int x = (int) (Math.random()*300);
            int y = (int) (Math.random()*300);
            //int width = (int) (Math.random()*10); I left this out because I think that generated rectangles with the same soze look more beautiful.
            //int height = (int) (Math.random()*10);
            graphics.fillRect(x, y, 5, 5);
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