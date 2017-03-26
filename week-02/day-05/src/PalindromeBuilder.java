import java.util.Scanner;

public class PalindromeBuilder {
  public static void main(String... args) {
    System.out.println("Enter the text: ");
    Scanner Scanner = new Scanner(System.in);
    String Input = Scanner.nextLine();
    System.out.println(rev(Input));
  }

  public static String rev(String Input) {
    int length = Input.length();
    String a = "";
    for (int i = length - 1; i >= 0; i--) {
      a = a + Input.charAt(i);
    }
    a = Input.concat(a);
    return a;
  }
}
