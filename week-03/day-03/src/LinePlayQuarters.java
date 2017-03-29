import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics) {
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    //Quarter1
    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(i * (150 / 14), 0, 150, (i + 1) * (150 / 14));
    }
    graphics.setColor(Color.CYAN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(0, i * (150 / 14), (i + 1) * (150 / 14), 150);
    }
    //Quarter2
    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(150 + i * (150 / 14), 0, 300, (i + 1) * (150 / 14));
    }
    graphics.setColor(Color.CYAN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(150, i * (150 / 14), 150 + (i + 1) * (150 / 14), 150);
    }
    //Quarter3
    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(i * (150 / 14), 150, 150, 150+(i + 1) * (150 / 14));
    }
    graphics.setColor(Color.CYAN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(0, 150+i * (150 / 14), (i + 1) * (150 / 14), 300);
    }
    //Quarter4
    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(150+i * (150 / 14), 150, 300, 150+(i + 1) * (150 / 14));
    }
    graphics.setColor(Color.CYAN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(150, 150+i * (150 / 14), 150+(i + 1) * (150 / 14), 300);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("LinePlayQuarters");
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