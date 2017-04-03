import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TreeThree {

  public static void mainDraw(Graphics graphics) {
    drawTree(200.0,200.0,20.0,30.0, graphics);
  }

  public static void drawTree(double x0,double y0,double len,double angle,Graphics graphics){
    if(len>2){
      double x1=x0+len*Math.cos(angle);
      double y1=y0-len*Math.sin(angle);
      int x0Int = (int) x0;
      int y0Int = (int) y0;
      int x1Int = (int) x1;
      int y1Int = (int) y1;
      graphics.drawLine(x0Int, y0Int, x1Int, y1Int);
      drawTree(x1,y1,len*0.75,angle+30, graphics);
      drawTree(x1,y1,len*0.66,angle-50, graphics);
    }
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("TreeThree");
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

