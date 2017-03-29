import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquarePositioning {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    drawSquare();
  }
    public static void drawSquare(Graphics graphics,int coordinateX, int coordinateY){
      graphics.drawLine(coordinateX, coordinateY, coordinateX + 50, coordinateY);
    }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("SquarePositioning");
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