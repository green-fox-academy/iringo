import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JComponent {

    private static int MAX_DEPTH = 0;

    private static int size = 500;
    private static int height = (int) (size * (Math.sqrt(3) / 2));


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics = (Graphics2D) g;

        drawTriangle(graphics, size, height, 0);


    }

    private static void drawTriangle (Graphics2D g, int size, int height, int depth) {

        if (depth > MAX_DEPTH) {
            return;
        }

        g.drawLine(size/2, height, size-size, height-height);
        g.drawLine(size-size, height-height, size, height-height);
        g.drawLine(size, height-height, size/2, height);

        int [] x1Points = {size/2, size/4, size * 3/4};
        int [] y1Points = {height - height, height/2, height/2};
        drawTriangle(g, );

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