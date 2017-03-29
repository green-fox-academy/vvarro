import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    //Quarter
    for (int i = 0; i <= 14; i++) {
      graphics.drawLine(i * (150 / 14), 150, 150, 150 - ((i + 1) * (150 / 14)));
    }
    //Quarter2
    for (int i = 0; i <= 14; i++) {
      graphics.drawLine(150, i * (150 / 14), 150 + (i + 1) * (150 / 14), 150);
    }
    //Quarter3
    for (int i = 0; i <= 14; i++) {
      graphics.drawLine(i * (150 / 14), 150, 150, 150 + (i + 1) * (150 / 14));
    }
    //Quarter4
    for (int i = 0; i <= 14; i++) {
      graphics.drawLine(300 - i * (150 / 14), 150, 150, 150 + (i + 1) * (150 / 14));
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("EnvelopeStar");
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