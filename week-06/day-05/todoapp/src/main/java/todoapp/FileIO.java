package todoapp;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileIO extends TodoApp {

  public FileIO() {
  }

  public static List<String[]> readToDoFromFile() throws IOException {
    CSVReader reader = new CSVReader(new FileReader("list.csv"), ';');
    List<String[]> list = reader.readAll();
    return list;
  }

  public void addToFile(List<String[]> list) {
    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter("list.csv"), ';',
          CSVWriter.NO_QUOTE_CHARACTER);
    } catch (IOException e) {
      e.printStackTrace();
    }
    writer.writeAll(list);
    try {
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
