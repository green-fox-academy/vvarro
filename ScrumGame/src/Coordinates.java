import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Coordinates {
  public Coordinates() {
  }

  Board board = new Board();

  public List<List<Integer>> collectCoordinates() {
    List<List<Integer>> coordinates = new ArrayList<List<Integer>>();
    for (int i = 0; i < board.getMapStructure().length; i++) {
      for (int j = 0; j < board.getMapStructure()[i].length; j++) {
        int value = board.getMapStructure()[i][j];
        if (value == 1) {
          coordinates.add(Arrays.asList(board.getMapStructure()[i][j]));
        }
      }
    }
    return coordinates;
  }

  public List<Integer> getCoordinates(List<List<Integer>> coordinates) {
    Random generator = new Random();
    List<Integer> goodCoordinates = new ArrayList<>();
    int randomIndex1 = generator.nextInt(collectCoordinates().size());
    int randomIndex2 = generator.nextInt(collectCoordinates().size());
    goodCoordinates.get(0);
    goodCoordinates.add(randomIndex2);
    return goodCoordinates;
  }
}
