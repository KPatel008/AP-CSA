package U7.Fractals;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Square Rose, a recursive algorithm
 */

public class SerpinskisTriangle extends JPanel {
    private int levels;

    public SerpinskisTriangle(int lev) {
        levels = lev;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call JPanel's paintComponent method
                                 // to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int [] xcoord = {xCenter - 128, xCenter + 128, xCenter};
        int [] ycoord = {yCenter + 128, yCenter + 128, yCenter - 94};


        g.setColor(new Color(20,70,50));
        drawAndSplit(g, xcoord, ycoord, 1);

    }

    public int[] midpoints(int[] x) {
        int[] m = new int[3];

        m[0] = (x[0] + x[1]) / 2;
        m[1] = (x[1] + x[2]) / 2;
        m[2] = (x[2] + x[0]) / 2;
        // m[3] = (x[3] + x[0]) / 2;

        return m;
    }

    public void drawAndSplit(Graphics g, int[] x, int[] y, int times) {
        if (times >= levels) {
            return;
        } else {
            g.drawPolygon(x, y, 3);
            int[] xMid = midpoints(x);
            int[] yMid = midpoints(y);

            int[] x1 = { x[0], xMid[0], xMid[2] };
            int[] y1 = { y[0], yMid[0], yMid[2] };

            int[] x2 = { xMid[0], x[1], xMid[1] };
            int[] y2 = { yMid[0], y[1], yMid[1] };

            int[] x3 = { xMid[2], xMid[1], x[2] };
            int[] y3 = { yMid[2], yMid[1], y[2] };
            // g.drawPolygon(xMid, yMid, 3);
            drawAndSplit(g, xMid, yMid, times + 1);
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SerpinskisTriangle panel = new SerpinskisTriangle(10);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
