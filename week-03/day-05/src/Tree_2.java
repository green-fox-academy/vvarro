import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree_2 {
  public static void mainDraw(Graphics graphics) {

    drawTree(graphics, 150, 210, 40, 20, 10, 6);
    graphics.drawLine(150, 210+40, 150, 210);
  }

  public static void drawTree(Graphics graphics, int x, int y, int lenght, int moveX, int moveY, int repeat) {
    if (repeat > 0) {
      for (int i = 0; i < repeat; i++) {
        graphics.drawLine(x, y, x, y - lenght-3);
        drawTree(graphics, x-moveX, y - lenght + moveY, lenght - 1, moveX, moveY, repeat - 1);
        graphics.drawLine(x, y, x - moveX, y - lenght + moveY);
        drawTree(graphics, x-moveX, y - lenght + moveY, lenght - 1, moveX, moveY, repeat - 1);
        graphics.drawLine(x, y, x + moveX, y - lenght + moveY);
        drawTree(graphics, x-moveX, y - lenght + moveY, lenght - 1, moveX, moveY, repeat - 1);
      }
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Tree_2");
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