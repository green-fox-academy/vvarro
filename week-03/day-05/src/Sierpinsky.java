import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky {
  public static void mainDraw(Graphics graphics) {

    drawBox(graphics, 5, 5, 700);
  }

  public static void drawBox(Graphics graphics, int x, int y, int side) {
    int small = side / 3;
    graphics.setColor(Color.WHITE);
    graphics.fillRect(x, y, side, side);
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x + small, y + small, small - 1, small - 1);
    if (small >= 1) {
      drawBox(graphics, x, y, small);
      drawBox(graphics, x + small, y, small);
      drawBox(graphics, x + 2 * small, y, small);
      drawBox(graphics, x, y + small, small);
      drawBox(graphics, x + 2 * small, y + small, small);
      drawBox(graphics, x, y + 2 * small, small);
      drawBox(graphics, x + small, y + 2 * small, small);
      drawBox(graphics, x + 2 * small, y + 2 * small, small);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Sierpinsky");
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
