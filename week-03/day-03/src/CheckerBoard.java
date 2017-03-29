import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int tempX = 0;
    int tempY = 0;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 4; j++) {
        if (i % 2 == 1) {
          graphics.setColor(Color.BLACK);
        } else {
          graphics.setColor(Color.WHITE);
        }
        graphics.fillRect(tempX, tempY, (300/8), (300/8));
        tempX = tempX + (300/8);
        if (i % 2 == 1) {
          graphics.setColor(Color.WHITE);
        } else {
          graphics.setColor(Color.BLACK);
        }
        graphics.fillRect(tempX, tempY, (300/8), (300/8));
        tempX = tempX + (300/8);
      }
      tempX = 0;
      tempY = tempY + (300/8);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("CheckerBoard ");
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