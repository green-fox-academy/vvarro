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
    for (int i = 0; i < lines.size(); i++) {
      for (int j = 0; j >= i ; j++) {
        if ((words.get(i).charAt(j)) == (words.get(i).charAt(j + 1))) {
          System.out.print(words.get(i).charAt(j + 1));
        }
      }
    }
  }
}