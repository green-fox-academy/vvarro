import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  String heroFacing;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    heroFacing = "assets/hero-down.png";

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 792));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    int[][] mapStructure = new int[][]{
      {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
      {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
      {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
      {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
      {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
      {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
      {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
      {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
      {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
      {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
      {1, 0, 1, 0, 1, 0, 1, 1, 1, 1}
    };
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    for (int i = 0; i < 11; i++) {
      for (int j = 0; j < 10; j++) {
        if (mapStructure[i][j] == 1) {
          PositionedImage floor = new PositionedImage("assets/floor.png", j * 72, i * 72);
          floor.draw(graphics);
        } else if (mapStructure[i][j] == 0) {
          PositionedImage wall = new PositionedImage("assets/wall.png", j * 72, i * 72);
          wall.draw(graphics);
        }
      }
    }
    PositionedImage hero = new PositionedImage(heroFacing, testBoxX, testBoxY);
    hero.draw(graphics);
  }

  public static void boardMain() {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
    int[][] position = new int[11][10];
    position[0][0] = 0;
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP && 0 < testBoxY) {
      heroFacing = "assets/hero-up.png";
      testBoxY -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && 720 > testBoxY) {
      heroFacing = "assets/hero-down.png";
      testBoxY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && 0 < testBoxX ) {
      heroFacing = "assets/hero-left.png";
      testBoxX -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && testBoxX < 648) {
      heroFacing = "assets/hero-right.png";
      testBoxX += 72;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}