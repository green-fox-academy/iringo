import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JComponent {

    private static int MAX_DEPTH = 3;

    private static int size = 500;
    private static int height = (int) (size * (Math.sqrt(3) / 2));

    private static int x0 = 0;
    private static int x1 = 500;
    private static int x2 = 250;

    private static int y0 = 0;
    private static int y1 = 0;
    private static int y2 = (int) (size * (Math.sqrt(3) / 2));


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics = (Graphics2D) g;


        drawTriangle(graphics, x0, y0, x1, y1, x2, y2, 0);

    }
        private void drawTriangle (Graphics2D g, int x0, int y0, int x1, int y1, int x2, int y2, int depth) {

            if (depth > MAX_DEPTH) {
                return;
            }

            g.drawLine(x0, y0, x1, y1);
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x0, y0);

            drawTriangle(g, x0, y0, x1 - size/2, y1, x2 - size/4, y2 - height/2, depth + 1);
            drawTriangle(g, x0 + size/2, y0, x1, y1, x2 + size/4, y2- height/2, depth +1);
            drawTriangle(g, x0 + size/4, y0 + height/2, x1 - size/4, y1 + height/2, x2, y2, depth +1);

        }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fractal");
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



