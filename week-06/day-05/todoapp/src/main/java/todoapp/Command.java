package todoapp;

public abstract class Command {

  private String arg;
  private String description;

  Command(String arg, String description) {
    this.arg = arg;
    this.description = description;
  }

  public abstract String execute();

  public String getArg() {
    return arg;
  }

  public String getDescription() {
    return " -" + arg + "   " + description;
  }
}
