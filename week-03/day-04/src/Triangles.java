import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics){
    int top[] = {105,17};
    int left[] = {0,200};
    int right[] = {210,200};
    graphics.drawLine(left[0],left[1] , 210, 200);
    graphics.drawLine(210, 200 , 105, 17);
    graphics.drawLine(105, 17 , 0, 200);
    graphics.drawLine(110, 26 , 10, 200);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Triangles");
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
