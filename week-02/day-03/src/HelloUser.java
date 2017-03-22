import java.util.Scanner;

/**
 * Created by Virág on 3/22/2017.
 */
public class HelloUser {
  public static void main(String[] args) {
    System.out.println("Enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    System.out.println("Hello, " + username + "!");
  }
}