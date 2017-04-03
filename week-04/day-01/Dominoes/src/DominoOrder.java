import java.util.ArrayList;
import java.util.List;

public class DominoOrder {
  public static List<Domino> order(List<Domino> domino) {
    Domino replace = new Domino(0, 0);
    for (int i = 0; i < domino.size(); i++) {
      for (int j = 0; j < domino.size(); j++) {
        if (domino.get(i).getValues()[1] == domino.get(j).getValues()[0]) {
          replace = domino.get(i);
          domino.set(i+1, domino.get(j));
          domino.set(j, replace);
        }
      }
    }
    return domino;
  }
}