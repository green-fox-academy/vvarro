import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  public static void mainDraw(Graphics graphics) {
    drawTree(graphics, 150, 300, 15, 10, 40, 6);
    graphics.drawLine(150, 300 + 40, 150, 210);
  }

  public static void drawTree(Graphics graphics, int x, int y, int moveX, int moveY, int lenght, int repeat) {
    for (int i = 0; i < repeat; i++) {
      graphics.drawLine(x, y, x - moveX, y - lenght + moveY);
      graphics.drawLine(x, y, x, y - lenght );
      graphics.drawLine(x, y, x + moveX, y - lenght + moveY);
      if (repeat > 0) {
        drawTree(graphics, x - moveX, y - lenght + moveY, moveX, moveY, lenght - 2, repeat - 1);
        drawTree(graphics, x, y - lenght, moveX, moveY, lenght - 2, repeat - 1);
        drawTree(graphics, x + moveX, y - lenght + moveY, moveX, moveY, lenght - 2, repeat - 1);
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