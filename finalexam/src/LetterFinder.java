import java.util.ArrayList;
import java.util.List;

public class LetterFinder {
  public List findLetter(String text, char letter) {
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter) {
        indexes.add(i);
      }
    }
    return indexes;
  }
}