import java.util.*;

/**
 * Created by Virág on 3/24/2017.
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    System.out.println("Enter the text: ");
    Scanner Scanner = new Scanner(System.in);
    String Input = Scanner.nextLine();
    ArrayList<Character> chars = new ArrayList<Character>();
    for (char c : Input.toCharArray()) {
      chars.add(c);
    }
    //Create palindroms
    ArrayList<String> palindrome = new ArrayList<String>();
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
    //Remove duplicates
    for (int k = 0; k < palindrome.size(); k++) {
      for (int l = k + 1; l < palindrome.size(); l++) {
        if (palindrome.get(k).equals(palindrome.get(l))) {
          palindrome.remove(l);
          l--;
        }
      }
    }
    //Remove not palindroms
    String sPalindrom = "";
    char pFirst = ' ';
    char pLast = ' ';
    for (int i = 0; i < palindrome.size(); i++) {
      sPalindrom = palindrome.get(i).toString();
      for (int j = 0; j < sPalindrom.length(); j++) {
        pFirst = sPalindrom.charAt(j);
        for (int k = sPalindrom.length() - 1; k >= j; k--) {
          pLast = sPalindrom.charAt(k);
          if (pFirst != pLast) {
            palindrome.remove(i);
          }
          System.out.println(palindrome);

        }
      }
    }
  }
}
