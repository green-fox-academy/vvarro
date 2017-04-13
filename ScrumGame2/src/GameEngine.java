import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  private Hero hero;
  private Skeleton skeleton1;
  private Skeleton skeleton2;
  private Skeleton skeleton3;

  public GameEngine() {
    this.gameMap = new GameMap();
    this.hero = new Hero(0, 0, "assets/hero-down.png", gameMap);
    this.skeleton1 = new Skeleton(gameMap.randCoordinate()[0], gameMap.randCoordinate()[1], "assets/skeleton.png", gameMap);
    this.skeleton2 = new Skeleton(gameMap.randCoordinate()[0], gameMap.randCoordinate()[1], "assets/skeleton.png", gameMap);
    this.skeleton3 = new Skeleton(gameMap.randCoordinate()[0], gameMap.randCoordinate()[1], "assets/skeleton.png", gameMap);
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    gameMap.createBoard();
    gameMap.getGameObjects().add(hero);
    gameMap.getCharacterList().add(hero);
    gameMap.getGameObjects().add(skeleton1);
    gameMap.getCharacterList().add(skeleton1);
    gameMap.getGameObjects().add(skeleton2);
    gameMap.getCharacterList().add(skeleton2);
    gameMap.getGameObjects().add(skeleton3);
    gameMap.getCharacterList().add(skeleton3);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (GameObject list : gameMap.getGameObjects()) {
        PositionedImage image = new PositionedImage(list.getCostume(), list.getPosX(), list.getPosY());
        image.draw(graphics);
      }
    }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    GameEngine gameEngine = new GameEngine();
    frame.add(gameEngine);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(gameEngine);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.moveRight();
    }
    repaint();
  }
}