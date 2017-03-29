import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDotd {

  public static void mainDraw(Graphics graphics){
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}
      drawPolygon(graphics, {{10, 10}, {290,  10}, {290, 290}, {10, 290}});
    }
  int[][] points = new int[][];
  public static void drawPolygon(Graphics graphics, int[][] points){
    ArrayList<Integer> polyX = new ArrayList<>();
    ArrayList<Integer> polyY = new ArrayList<>();
for (int i = 0; i < points.length; i++ ) {
    polyX.set(i, points[i][0]);
    polyY.set(i, points[0][i]);
    }
    int[] x = points[][] {10, 290, 290, 10};
    int[] y = {10, 10, 290, 290};
    int n = points.length();
    graphics.drawPolygon(x, y, n);
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("ConnectTheDotd");
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


// create a 300x300 canvas.