import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // draw a box that has different colored lines on each edge.
    graphics.setColor(Color.RED);
    graphics.drawLine(130, 50, 180, 50);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(180, 50, 180, 100);
    graphics.setColor(Color.BLUE);
    graphics.drawLine(180, 100, 130, 100);
    graphics.setColor(Color.PINK);
    graphics.drawLine(130, 100, 130, 50);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("ColoredBox");
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
