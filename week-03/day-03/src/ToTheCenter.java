import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter  {
  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("ToTheCenter");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    mainDraw(cordinateX, cordinateY, 150, 150);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    System.out.println("Please give me the X coordinate: ");
    Scanner xScanner = new Scanner(System.in);
    int coordinateX = xScanner.nextInt();
    System.out.println("Please give me the Y coordinate: ");
    Scanner yScanner = new Scanner(System.in);
    int coordinateY = yScanner.nextInt();
    graphics.drawLine(coordinateX, coordinateY , 150, 150);
  }
}