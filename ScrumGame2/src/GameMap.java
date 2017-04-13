import java.util.ArrayList;
import java.util.List;

public class GameMap {
  public static int[][] mapStructure;
  private static List<List<GameObject>> gameObjects;

  public int[][] getMapStructure() {
    return mapStructure;
  }

  public static List<List<GameObject>> getGameObjects() {
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

    this.gameObjects = new ArrayList<>(new ArrayList<>());
  }

  public void createBoard() {
    for (int i = 0; i < 10; i++) {
      List<GameObject> temp = new ArrayList<>();
      gameObjects.add(temp);
      for (int j = 0; j < 10; j++) {
        if (mapStructure[i][j] == 1) {
          temp.add(new Floor(j * 72, i * 72, "assets/floor.png"));
        } else if (mapStructure[i][j] == 0) {
          temp.add(new Wall(j * 72, i * 72, "assets/wall.png"));
        }
      }
    }
  }
}