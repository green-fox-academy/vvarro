import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    drawSquare(graphics,10,20 , 20, 50);
    drawSquare(graphics,40,30 , 20, 50 );
    drawSquare(graphics,50,20 , 40, 50 );
  }

  public static void drawSquare(Graphics graphics,int size, int h, int s, int b){
    Color.getHSBColor(h,s,b);
    graphics.fillRect(150-(size/2), 150-(size/2), size, size);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}