import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class GameEngine extends JComponent {
  private GameMap gameMap;
  private Hero hero;

  public GameEngine() {
    this.gameMap = new GameMap();
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    this.hero = new Hero(0, 0, "assets/hero-down.png");
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    gameMap.createBoard();
    for (List<GameObject> list : gameMap.getGameObjects()) {
      for (GameObject i : list) {
        PositionedImage image = new PositionedImage(i.getCostume(), i.getPosX(), i.getPosY());
        image.draw(graphics);
      }
    }
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board
    // to it
    JFrame frame = new JFrame("RPG Game");
    GameEngine gameEngine = new GameEngine();
    GameObject hero = new GameObject();
    frame.add(gameEngine);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
  }
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {

      hero.moveUp();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.moveDown();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && 0 < testBoxX) {
      hero.
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && testBoxX < 648) {
      heroFacing = "assets/hero-right.png";
      if (mapStructure[testBoxY / 72][testBoxX / 72 + 1] != 0) {
        testBoxX += 72;
      }
}
