import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    drawTriangles(graphics, 600, 600, 5);
  }

  public static void drawTriangles(Graphics graphics, int A, int B, int num) {
    if (num > 0) {
      double firstX = (A / 2.0) * (1 - 1 / Math.sqrt(3));
      double firstY = 3.0 * B / 4.0;
      int xInt = (int) firstX;
      int yInt = (int) firstY;
      graphics.drawLine(xInt, yInt, A - xInt, yInt);
      graphics.drawLine(A - xInt, yInt, A / 2, B / 4);
      graphics.drawLine(A / 2, B / 4, xInt, yInt);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Triangles");
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
