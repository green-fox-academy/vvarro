import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameEngine extends JComponent {
  private GameMap gameMap;

  public GameEngine() {
    this.gameMap = new GameMap();
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
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
    frame.add(gameEngine);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
  }
}
