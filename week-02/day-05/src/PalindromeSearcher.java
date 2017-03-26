import java.util.*;

public class PalindromeSearcher {
  public static void main(String[] args) {
    System.out.println("Enter the text: ");
    Scanner Scanner = new Scanner(System.in);
    String Input = Scanner.nextLine();
    ArrayList<String> palindrome = new ArrayList<>();
    palindrome = palindromise(Input);
    int outPrint = 0;
    for (int i = 0; i < palindrome.size(); i++) {
      String result = palindrome.get(i);
      if (realPalindrome(result)) {
        System.out.print("\"" + result + "\" ");
        outPrint = 1;
      }
    }
    if (outPrint == 0) {
      System.out.print("[]");
    }
  }

  public static ArrayList palindromise(String input) {
    ArrayList<String> palindrome = new ArrayList<String>();
    String in = "";
    char first = ' ';
    char last = ' ';
    for (int i = 0; i < input.length(); i++) {
      first = input.charAt(i);
      for (int j = i + 1; j < input.length(); j++) {
        last = input.charAt(j);
        if (first == last) {
          in = input.substring(i, j + 1);
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

