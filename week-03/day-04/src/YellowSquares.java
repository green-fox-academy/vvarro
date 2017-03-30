import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquares {
  public static void mainDraw(Graphics graphics) {
    grid(graphics, 0, 0, 300);
  }

  public static void grid(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(x, y, size, size);
    graphics.setColor(Color.BLACK);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        graphics.drawRect(j * (size / 3), i * (size / 3), size/3, size/3);
      }
    }
  }

  public static void emptyGrid(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x, y, size, size);
      }

  public static int drawGrid(int x, int y, int size, int position, Graphics graphics) {
    if (position % 2 == 1) {
      graphics.fillRect(x, y, size, size);
      grid(graphics, 0, 0, 300);;
    } else if {
      System.out.println(num);
      return drawGrid(size+size/3, );
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("YellowSquares");
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
