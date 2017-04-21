package todoapp;

import java.util.ArrayList;
import java.util.List;

public class TodoApp {

  List<Command> commands;
  ArrayList<Task> todo;

  public TodoApp() {
    todo = new ArrayList<Task>();
    commands = new ArrayList<Command>();
    commands.add(new ListCommand());
    commands.add(new AddCommand());
    commands.add(new CompleteCommand());
  }

  public String runUsage() {
      String usage = "Java Todo application\n" +
          "=======================\n" +
          "Command line arguments:\n";
      for (Command command : commands) {
        usage += command.getDescription() + "\n";
      }
      return usage;
    }
}
