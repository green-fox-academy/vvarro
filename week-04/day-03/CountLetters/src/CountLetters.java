import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public CountLetters() {
  }

  public Map countLetters(String text) {
    char[] char_array = text.toCharArray();
    Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
    for (char i : char_array) {
      charCounter.put(i, charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);
    }
    for (Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    return charCounter;
  }
}
