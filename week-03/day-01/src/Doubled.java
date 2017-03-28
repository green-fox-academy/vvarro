import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("day-01/duplicated-chars.txt");
    List<String> lines = Files.readAllLines(path);
    System.out.println(lines);
    ArrayList<String> words = new ArrayList<>(lines);
    String row = new String();
    for (int i = 0; i < lines.size(); i++) {
      words.add(lines.get(i));
    }
    String temp = new String();
    for (int i = 0; i < words.size(); i++) {
      char[] charArray = words.get(i).toCharArray();
      temp = "";
      for (int k = 0; k < charArray.length; k = k + 2) {
        temp = temp + charArray[k];
      }
      words.set(i, temp);
    }
    for (int i = 0; i < words.size(); i++) {
      System.out.println(words.get(i));
    }
  }
}