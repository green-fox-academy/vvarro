import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result

    System.out.println(countAs("afile.txt"));
    System.out.println(countAs("not-a-file"));

  }

  private static int countAs(String filename) {
    Path filePath = Paths.get(filename);
    List<String> initList;
    try {
      initList = Files.readAllLines(filePath);
      int noOfAs = 0;
      for (String line : initList) {
        for (int i = 0; i < line.length(); i++) {
          if (line.charAt(i) == 'a' | line.charAt(i) == 'A') {
            noOfAs++;
          }
        }
      }
      return noOfAs;
    } catch (IOException e) {
      return 0;
    }
  }
}