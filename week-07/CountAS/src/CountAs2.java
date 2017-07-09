import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs2 {
  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
    System.out.println(allTheAs("afile.txt"));
    System.out.println(allTheAs("not-a-file"));
  }

  public static int allTheAs(String filename) {
    Path path = Paths.get(filename);
    List<String> initList = new ArrayList<>();
    try {
      initList = Files.readAllLines(path);
      int counter = 0;
      for (String lines : initList) {
        for (int i = 0; i < lines.length(); i++) {
          if ((initList.toString().charAt(i) == 'a') || (initList.toString().charAt(i) == 'A')) {
            counter += 1;
          }
        }
      }
      return counter;
    } catch (IOException e) {
      return 0;
    }
  }
}