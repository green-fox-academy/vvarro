import java.util.ArrayList;
import java.util.List;

public class LetterFinder {

  public List<Integer> findCharLetter(String text, char letter) {
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter) {
        indexes.add(i);
      }
    }
    return indexes;
  }

  public List<Integer> findCharLetterMethod(String text, char letter) {
    List<Integer> indexes = new ArrayList<>();
    indexes = findCharLetter(text, letter);
    return indexes;
  }

  public List<Integer> findStringLetter(String text, String letter) {
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter.charAt(0)) {
        indexes.add(i);
      }
    }
    return indexes;
  }
}