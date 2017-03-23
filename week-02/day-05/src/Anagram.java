import java.util.Scanner;

/**
 * Created by Virág on 3/23/2017.
 */
public class Anagram {
  public static void main(String... args) {
    System.out.println("Enter the first word: ");
    Scanner firstScanner = new Scanner(System.in);
    String firstInput = firstScanner.nextLine();
    System.out.println("Enter the second word: ");
    Scanner secondScanner = new Scanner(System.in);
    String secondInput = secondScanner.nextLine();
    boolean result = anagram(firstInput, secondInput);
    System.out.println(result);
  }

  public static boolean anagram(String firstInput, String secondInput) {
    int length = firstInput.length();
    String reversedFirst = "";
    for (int i = length - 1; i >= 0; i--) {
      reversedFirst = reversedFirst + firstInput.charAt(i);
    }
    if (reversedFirst.equals(secondInput)) {
      return true;
    } else {
      return false;
    }
  }
}