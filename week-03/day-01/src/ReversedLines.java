import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Virág on 3/29/2017.
 */
public class ReversedLines {
  public static void main(String[] args) throws IOException {
    List<String> lines = new ArrayList<String>();
    try {
      Path path = Paths.get("day-01/reversed-lines.txt");
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("Error: " + e.getClass());
    }

    ArrayList<String> text = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      text.add(i, lines.get(i));
    }
      int length = text.size();
      String oriText = "";
      for (int i = length - 1; i >= 0; i--) {
        String[] stringText = Arrays.toString(text.get(i));
        oriText = oriText + text.charAt(i);
      }
      return oriText;
    }  }
}
