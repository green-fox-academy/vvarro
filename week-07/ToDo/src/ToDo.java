import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  private final static String FILE_NAME = "data.csv";

  public static void main(String[] args) {
    List<String> rawLines = readLinesFromFile();
    garden = new Garden();
    processData(rawLines);

    if (args[0].equals("-a") && args.length == 3) {
      String type = args[1];
      String color = args[2];

      if (type.equals("tree")) {
        garden.add(new Tree(0, color));
      } else if (type.equals("flower")) {
        garden.add(new Flower(0, color));
      }
    } else if (args[0].equals("-l") && args.length == 1) {
      System.out.println(garden.toString());
    }

    writeToFile(garden.toFile());
  }

  private static void writeToFile(List<String> data) {
    Path path = Paths.get(FILE_NAME);
    try {
      Files.write(path, data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  private static List<String> readLinesFromFile() {
    Path path = Paths.get(FILE_NAME);
    List<String> rawLines;

    try {
      rawLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      rawLines = new ArrayList<>();
    }

    return rawLines;
  }

  private static void processData(List<String> rawLines) {
    for (String line : rawLines) {
      String[] splittedLine = line.split(";");

      String type = splittedLine[0];
      String color = splittedLine[1];
      double water = Double.valueOf(splittedLine[2]);

      if (type.equals("flower")) {
        garden.add(new Flower(water, color));
      } else if (type.equals("tree")) {
        garden.add(new Tree(water, color));
      }
    }
  }
}