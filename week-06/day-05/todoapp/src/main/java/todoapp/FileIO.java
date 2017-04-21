package todoapp;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class FileIO extends TodoApp {

  public FileIO(ArrayList<Task> toDoMap) throws IOException {
    super(toDoMap);
  }

  public static List<String[]> readToDoFromFile() throws IOException {
    CSVReader reader = new CSVReader(new FileReader("list.csv"), ';');
    List<String[]> lines = reader.readAll();
    return lines;
  }

  public void addToFile(List<String[]> lines) {
    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter("list.csv"), ';',
          CSVWriter.NO_QUOTE_CHARACTER);
    } catch (IOException e) {
      e.printStackTrace();
    }
    writer.writeAll(lines);
    try {
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static LinkedHashMap<String, Boolean> processData(List<String> toDo) {
    LinkedHashMap<String, Boolean> toDoMap = new LinkedHashMap<>();
    for (int i = 0; i < toDo.size(); i++) {
      String[] splittedLine = toDo.get(i).split(";");
      if (splittedLine[1].equals("done")) {
        toDoMap.put(splittedLine[0], true);
      } else {
        toDoMap.put(splittedLine[0], false);
      }
    }
    return toDoMap;
  }
}
