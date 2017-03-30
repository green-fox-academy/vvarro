// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

import java.util.Scanner;

public class StringsAgainAnd {
  public static void main(String[] args) {
    System.out.print("Please give me a text:");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(replace(text));
  }

  public static String replace(String textRep) {
    if (textRep.length() < 1) {
      return textRep;
    } else {
      return textRep.charAt(0) + "*" + replace(textRep.substring(1));
    }
  }
}