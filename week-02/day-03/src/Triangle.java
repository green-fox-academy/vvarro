import java.util.Scanner;

/**
 * Created by Virág on 3/22/2017.
 */
public class Triangle {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println(" ");
    }
  }
}
