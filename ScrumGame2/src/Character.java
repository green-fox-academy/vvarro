import java.util.ArrayList;
import java.util.List;

public class Character extends GameObject {
  private static List<GameObject> characterList;
  private GameMap map;

  public static List<GameObject> getCharacterList() {
    return characterList;
  }

  public Character(int posX, int posY, String costume, GameMap map) {
    super(posX, posY, costume);
    characterList = new ArrayList<>();
    this.map = map;
  }

  public void moveUp() {
    if ((GameMap.mapStructure[getPosY() / 72 - 1][getPosX() / 72] != 0) && (getPosY() - 72 >= 0)) {
      move(0, -72);
    }
  }

  public void moveDown() {
    if ((GameMap.mapStructure[getPosY() / 72 + 1][getPosX() / 72] != 0) && (getPosY() + 72 < 720)) {
      move(0, +72);
    }
  }

  public void moveLeft() {
    if ((GameMap.mapStructure[getPosY() / 72][getPosX() / 72 - 1] != 0) && (getPosX() - 72 >= 0)) {
      move(-72, 0);
    }
  }

  public void moveRight() {
    if ((GameMap.mapStructure[getPosY() / 72][getPosX() / 72 + 1] != 0) && (getPosX() + 72 < 720)) {
      move(+72, 0);
    }
  }
}
