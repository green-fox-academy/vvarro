package todoapp;

public abstract class Command {

  private String arg;
  private String description;

  Command(String arg, String description) {
    this.arg = arg;
    this.description = description;
  }

  public String getArg() {
    return arg;
  }

  public abstract void execute();

  public String getDescription() {
    return " -" + arg + "   " + description;
  }
}
