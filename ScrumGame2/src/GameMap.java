import java.util.ArrayList;
import java.util.List;

public class GameMap {
  public static int[][] mapStructure;
  private static List<GameObject> gameObjects;
  private static List<GameObject> characterList;

  public int[][] getMapStructure() {
    return mapStructure;
  }

  public static List<GameObject> getCharacterList() {
    return characterList;
  }

  public static List<GameObject> getGameObjects() {
    return gameObjects;
  }

  public GameMap() {
    this.mapStructure = new int[][]{
      {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
      {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
      {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
      {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
      {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
      {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
      {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
      {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
      {1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
    };

    this.gameObjects = new ArrayList<>();
    this.characterList = new ArrayList<>();
  }

  public void createBoard() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (mapStructure[i][j] == 1) {
          gameObjects.add(new Floor(j * 72, i * 72, "assets/floor.png"));
        } else if (mapStructure[i][j] == 0) {
          gameObjects.add(new Wall(j * 72, i * 72, "assets/wall.png"));
        }
      }
    }
  }

  public boolean isFloor(int posX, int posY) {
    for (GameObject g : gameObjects) {
      if (g.getPosX() == posX && g.getPosY() == posY) {
        GameObject floor = new Floor();
        g.getClass().equals(floor.getClass());
        return true;
      }
    }
    return false;
  }

  public boolean isCharacter(int posX, int posY) {
    for (GameObject g : characterList) {
      if (g.getPosX() == posX && g.getPosY() == posY) {
        return true;
      }
    }
    return false;
  }

  public int[] randCoordinate() {
    int[] randCoordinate = new int[2];
    int x = (int) (Math.random() * 10) * 72;
    int y = (int) (Math.random() * 10) * 72;
    while ((isCharacter(x, y) == true) && (isFloor(x, y) == false)) {
      x = (int) (Math.random() * 10) * 72;
      y = (int) (Math.random() * 10) * 72;
    }
      randCoordinate[0] = x;
      randCoordinate[1] = y;
    return randCoordinate;
  }
}

