import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("l").withRequiredArg();
    parser.accepts("a").withRequiredArg();
    parser.accepts("r").withRequiredArg();
    parser.accepts("c").withRequiredArg();
    OptionSet commands = parser.parse(args);

    if (commands.has("a")) {
      System.out.println("`-a` was given with the argument " + commands.valueOf("a"));
    }

    if (commands.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }

    if (commands.has("r")) {
      System.out.println("`-r` was given with the no additional information.");
    }

    if (commands.has("c")) {
      System.out.println("`-l` was given with the no additional information.");
    }
  }

}