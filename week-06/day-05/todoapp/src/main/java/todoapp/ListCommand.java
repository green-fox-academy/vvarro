package todoapp;

public class ListCommand extends Command{
  ListCommand() {
    super("l", "Lists all the tasks");
  }

  public void execute() {
    System.out.println("No todos for today! :)");
  }

}
