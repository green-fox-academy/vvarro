import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    Color[] rainbow = {
      new Color(148, 0, 211),
      new Color(75, 0, 130),
      new Color(0, 0, 255),
      new Color(0, 255, 0),
      new Color(255, 255, 0),
      new Color(255, 127, 0),
      new Color(255, 0, 0),
    };

    for (int i = 0; i < 8; i++) {
      drawSquare(graphics, (i + 1) * 10, rainbow[i]);
    }
  }

  public static void drawSquare(Graphics graphics, int size, Color rainbow) {
    graphics.fillRect(150 - (size / 2), 150 - (size / 2), size, size);
    graphics.setColor(rainbow);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("RainbowBoxes");
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