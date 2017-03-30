// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    System.out.print("Please give me a text:");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    char charOri = 'x';
    char charRep = 'y';
    System.out.println(replace(text, charOri, charRep));
  }

  public static String replace(String textRep, char charOri, char charRep) {
    if (textRep.length() < 1) {
      return textRep;
    }
    if (textRep.charAt(0) == charOri) {
      textRep = charRep + textRep.substring(1);
    }
    return textRep.charAt(0) + replace(textRep.substring(1, textRep.length()), charOri, charRep);
  }
}
