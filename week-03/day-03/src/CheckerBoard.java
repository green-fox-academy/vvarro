import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int tempX = 0;
    int tempY = 0;
    for (int i = 0; i < 8; i++) {
      graphics.setColor(Color.WHITE);
      graphics.fillRect(tempX, tempY, 37, 37);
      tempX = tempX + 37;
      graphics.setColor(Color.BLACK);
      graphics.fillRect(tempX, tempY, 37, 37);
      tempX = tempX + 37;
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