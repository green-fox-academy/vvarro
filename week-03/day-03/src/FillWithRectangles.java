import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.BLUE);
    graphics.fillRect(30, 40, 10, 60);
    graphics.setColor(Color.GREEN);
    graphics.fillRect(40, 100, 50, 10);
    graphics.setColor(Color.RED);
    graphics.fillRect(50, 40, 80, 30);
    graphics.setColor(Color.PINK);
    graphics.fillRect(100, 140, 30, 60);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("FillWithRectangles");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}