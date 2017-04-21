import joptsimple.OptionParser;
import joptsimple.OptionSet;
import todoapp.TodoApp;

public class Main {

  public static void main(String[] args) {
    TodoApp todoApp = new TodoApp();

    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withRequiredArg().ofType(String.class);
    parser.accepts("r").withRequiredArg().ofType(String.class);
    parser.accepts("c").withRequiredArg().ofType(String.class);
    OptionSet options = parser.parse(args);
    if (options.has("a")) {
      System.out.println("Task added: " + options.valueOf("a"));
    }
    if (options.has("l")) {
      System.out.println("List all the tasks");
    }
    if (options.has("r")) {
      System.out.println("Task removed:  " + options.valueOf("r"));
    }
    if (options.has("c")) {
      System.out.println("Task checked:  " + options.valueOf("c"));
    }
  }
}