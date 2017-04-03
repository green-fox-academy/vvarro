// Given a string, compute recursively a new string where all the 'x' chars have been removed.

import java.util.Scanner;

public class StringsAgain {
  public static void main(String[] args) {
    System.out.print("Please give me a text:");
    Scanner scanner = new Scanner(System.in);
    String textRep = scanner.nextLine();
    char charX = 'x';
    System.out.println(replace(textRep, charX));
  }

  public static String replace(String textRep, char charX) {
    if (textRep.length() < 1) {
      return textRep;
    }
    if (textRep.charAt(0) == charX) {
      textRep = "" + textRep.substring(1);
    }
    return textRep.charAt(0) + replace(textRep.substring(1, textRep.length()), charX);
  }
}
