package U7.Fractals;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Square Rose, a recursive algorithm
 */

public class BoxFractal extends JPanel {
  private int levels;

  public BoxFractal(int lev) {
    levels = lev;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g); // Call JPanel's paintComponent method
                             // to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;

    int x = xCenter - 243;
    int y = yCenter - 243;
    int width = 486;
    int height = 486;

    int[] xcoord = { xCenter - 128, xCenter - 128, xCenter + 128, xCenter + 128 };
    int[] ycoord = { yCenter - 128, yCenter + 128, yCenter + 128, yCenter - 128 };

    g.setColor(new Color(20,70,50));
    drawAndSplit(g, x, y, width, height, 1);

  }

  public int[] midpoints(int[] x) {
    int[] m = new int[4];

    m[0] = (x[0] + x[1]) / 2;
    m[1] = (x[1] + x[2]) / 2;
    m[2] = (x[2] + x[3]) / 2;
    m[3] = (x[3] + x[0]) / 2;

    return m;
  }

  public void drawAndSplit(Graphics g, int x, int y, int width, int height, int times) {
    
    if (times >= levels) {
      g.fillRect(x, y, width, height);
      return;
    }
    else {
      int w = width / 3;
      int h = height / 3;

      drawAndSplit(g, x, y, w, h, times + 1);
      drawAndSplit(g, x + 2*w, y, w, h, times + 1);
      drawAndSplit(g, x, y + 2*h, w, h, times + 1);
      drawAndSplit(g, x + 2*w, y + 2*h, w, h, times + 1);
      drawAndSplit(g, x + w, y + h, w, h, times + 1);
    }

  }

  public static void main(String[] args) {
    JFrame window = new JFrame("Fractals");
    window.setBounds(200, 200, 500, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    BoxFractal panel = new BoxFractal(5);
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}
