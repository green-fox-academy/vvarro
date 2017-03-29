import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(i * (300 / 14), 0, 300, (i+1) * (300 / 14));
    }
    graphics.setColor(Color.CYAN);
    for (int i = 0; i < 14; i++) {
      graphics.drawLine(0, i * (300 / 14), (i+1) * (300 / 14), 300);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("LinePlay");
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
