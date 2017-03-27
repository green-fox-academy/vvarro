import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Virág on 3/27/2017.
 */
public class Lotto {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("day-01/otos.csv");
    List<String> lines = Files.readAllLines(path);
    System.out.println(lines);
    String[] splitted = new String[0];
    for (String oneLine : lines) {
      splitted = (oneLine.split(";"));
      System.out.println(Arrays.toString(splitted));
    }
    System.out.println(Arrays.toString(splitted));
    ArrayList<String> numbers = new ArrayList<>();
    numbers.addAll(Arrays.toString(splitted));
  }
}

