import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquares {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 0, 500, 500);
    drawGrid(graphics, 0, 0, 500, 5);
  }

  public static void drawGrid(Graphics graphics, int x, int y, int size, int position) {
    if (position > 0) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if ((3 * i + j + 1) % 2 == 1) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(size / 3 * j + x, size / 3 * i + y, size / 3, size / 3);
          } else {
            drawGrid(graphics,size / 3 * j + x, size / 3 * i + y, size / 3, position-1);
          }
        }
      }
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
