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
    
    System.out.println(chars);
  }
}
