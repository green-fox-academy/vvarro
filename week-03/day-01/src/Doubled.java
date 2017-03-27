import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Virág on 3/27/2017.
 */
public class Doubled {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("day-01/duplicated-chars.csv");
    List<String> lines = Files.readAllLines(path);
    System.out.println(lines);
  }
}
