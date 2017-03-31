import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RotateTree {
  public static void mainDraw(Graphics graphics) {
    drawTree(graphics, 150, 300, 40, 15, 10, 1);
    graphics.drawLine(150, 300 + 40, 150, 300);
  }

  public static void drawTree(Graphics graphics, int x, int y, int lenght, int moveX, int moveY, int repeat) {
      graphics.drawLine(x, y, x - moveX, y - lenght + moveY);//bal
      graphics.drawLine(x, y, x, y - lenght );//kozepso
      graphics.drawLine(x, y, x + moveX, y - lenght + moveY);//jobb

      graphics.drawLine(x - moveX, y - lenght + moveY, x - moveX*2 - moveX, y - lenght + moveY - lenght + moveY*2);//bal
      graphics.drawLine(x - moveX, y - lenght + moveY, x-moveX-moveX, y - lenght + moveY - lenght + moveY);//kozepso
      graphics.drawLine(x - moveX, y - lenght + moveY, x - moveX*2 + moveX , y - lenght+ moveY - lenght+moveY);//jobb
    }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("RotateTree");
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
