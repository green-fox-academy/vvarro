import java.util.*;

/**
 * Created by Virág on 3/24/2017.
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    System.out.println("Enter the text: ");
    Scanner Scanner = new Scanner(System.in);
    String Input = Scanner.nextLine();
    ArrayList<String> palindrome = new ArrayList<>();
    palindrome = palindromise(Input);
    int p = 0;
    for (int i = 0; i < palindrome.size(); i++) {
      String result = palindrome.get(i);
      if (realPalindrome(result)) {
        System.out.print("\"" + result + "\" ");
        p = 1;
      }
      }
    if (p == 0 ) {
      System.out.print("[]");
    }
    }

  public static ArrayList palindromise(String Input) {
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
    return palindrome;
  }

  public static boolean realPalindrome(String result) {
    char pFirst = ' ';
    char pLast = ' ';
    for (int i = 0; i < result.length(); i++) {
      for (int j = 0; j < result.length(); j++) {
        pFirst = result.charAt(j);
        pLast = result.charAt(result.length() - 1 - j);
        if ((pFirst != pLast) && (j < result.length() - 1 - j)) {
          return false;
        }
      }
    }
    return true;
  }
}
