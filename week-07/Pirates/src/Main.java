import java.util.ArrayList;

public class Main {
  public static void main(String... args){
    ArrayList<Pirates> pirates = new ArrayList<>();

    // Given this list...

    pirates.add(new Pirates("Olaf", false, 12));
    pirates.add(new Pirates("Uwe", true, 9));
    pirates.add(new Pirates("Jack", true, 16));
    pirates.add(new Pirates("Morgan", false, 17));
    pirates.add(new Pirates("Hook", true, 20));

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold

    System.out.println(Pirates.hasWoodenLegAndGold(pirates));
  }
}