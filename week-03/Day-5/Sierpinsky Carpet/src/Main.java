import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JComponent {

    private static int MAX_DEPTH = 3;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x0 = 300;
        int y0 = 300;
        int side = 200;

        Graphics2D graphics = (Graphics2D) g;

        drawSquare(graphics, x0, y0, side, 0);

    }

    private void drawSquare(Graphics2D g, int x0, int y0, int side, int depth) {
        if (depth > MAX_DEPTH) {
            return;
        }

        g.fillRect(x0-side/2, y0-side/2, side, side);

        drawSquare(g, x0 - side, y0 -side, side/3, depth + 1);
        drawSquare(g, x0, y0 - side, side/3, depth + 1);
        drawSquare(g, x0 + side, y0 - side, side/3, depth + 1);
        drawSquare(g, x0 - side, y0, side/3, depth + 1);
        drawSquare(g, x0 + side, y0, side/3, depth + 1);
        drawSquare(g, x0 - side, y0 + side, side/3, depth + 1);
        drawSquare(g, x0, y0 + side, side/3, depth + 1);
        drawSquare(g, x0 + side, y0 + side, side/3, depth + 1);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Main main = new Main();
        main.setPreferredSize(new Dimension(600, 600));

        frame.getContentPane().add(main);

        /*Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MAX_DEPTH++;
                main.repaint();
            }
        });

        timer.start();*/

        frame.pack();
        frame.setVisible(true);
    }
}