import java.util.*;

/**
 * Created by Virág on 3/24/2017.
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    System.out.println("Enter the text: ");
    Scanner Scanner = new Scanner(System.in);
    String Input = Scanner.nextLine();
    ArrayList<String> palindrome = new ArrayList<String>();
    palindromise(Input, palindrome);
    realPalindrome(palindrome);
      }

  public static void palindromise(String Input, ArrayList palindrome) {
    String in = "";
    char first = ' ';
    char last = ' ';
    for (int i = 0; i < Input.length(); i++) {
      first = Input.charAt(i);
      for (int j = i + 1; j < Input.length(); j++) {
        last = Input.charAt(j);
        if (first == last) {
          in = Input.substring(i, j + 1);
          palindrome.add(in);

        }
      }
    }
  }

  public static boolean realPalindrome(ArrayList palindrome) {
    String sPalindrom = "";
    char pFirst = ' ';
    char pLast = ' ';
    for (int i = 0; i < palindrome.size(); i++) {
      sPalindrom = palindrome.get(i).toString();
      for (int j = 0; j < sPalindrom.length(); j++) {
        pFirst = sPalindrom.charAt(j);
        pLast = sPalindrom.charAt(sPalindrom.length() - 1 - j);
        if ((pFirst != pLast) && (j < sPalindrom.length() - 1 - j)) {
          return false;
        }
      }
    }
    return true;
  }
}
