/**
 * Created by Virág on 3/23/2017.
 */
public class TakesLonger {
  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    StringBuilder quotePart1 = new StringBuilder("Hofstadter's Law: It ");
    StringBuilder quotePart2 = new StringBuilder("always takes longer than ");
    StringBuilder quotePart3 = new StringBuilder("you expect, even when you take into account Hofstadter's Law.");
    quotePart1.append(quotePart2);
    quotePart1.append(quotePart3);
    System.out.println(quotePart1);
  }
}

