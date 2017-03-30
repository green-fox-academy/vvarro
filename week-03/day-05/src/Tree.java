import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  public static void mainDraw(Graphics graphics) {
    paint(graphics);
  }

  public void drawTree(Graphics g, int x, int y, int n, int depth) {
    if (depth > 0) {
      int childDistanceX = (int) (Math.pow(n, depth) * DISTANCE_X);
      int childX = x - (n - 1) * childDistanceX / 2;
      int childY = y - DISTANCE_Y;

      for (int child = 0; child < n; child++) {
        g.drawLine(x, y, childX, childY);
        drawTree(g, childX, childY, n, depth - 1);
        childX += childDistanceX;
      }
    }
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Tree");
    jFrame.setSize(new Dimension(300, 300));
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