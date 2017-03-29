import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static void mainDraw(Graphics graphics) {
    // create 19 purple squares diagonal function that takes 2 parameters:
    for (int i=0; i < 19; i++ ){
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect((i+1)*10, (i+1)*10, 10,10);
      graphics.setColor(Color.BLACK);
      graphics.drawRect((i+1)*10, (i+1)*10, 10,10);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("PurpleSteps");
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