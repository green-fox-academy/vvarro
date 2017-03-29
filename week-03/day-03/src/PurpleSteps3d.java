import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

  public static void mainDraw(Graphics graphics) {
    // create 19 purple squares diagonal function that takes 2 parameters:
    int temp = 10;
    for (int i=0; i < 6; i++ ){
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(temp,temp, (i+1)*10,(i+1)*10);
      graphics.setColor(Color.BLACK);
      graphics.drawRect(temp,temp, (i+1)*10,(i+1)*10);
      temp = temp + ((i+1) * 10);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("PurpleSteps3d");
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