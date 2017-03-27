import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Virág on 3/27/2017.
 */
public class Doubled {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("day-01/duplicated-chars.txt");
    List<String> lines = Files.readAllLines(path);
    System.out.println(lines);
    ArrayList<String> words = new ArrayList<>(lines);
    System.out.println(words.get(0));
    for (int i = 0; i < words.size(); i++) {
      for (int j = 0; j < words.size(); j++) {
        if (words.get(i).indexOf(j) == words.get(i).indexOf(j + 1)) {
          System.out.println("!");
        }
      }
    }
    System.out.println(words);
  }
}