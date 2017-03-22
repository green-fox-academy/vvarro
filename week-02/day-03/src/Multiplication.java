import java.util.Scanner;

/**
 * Created by Virág on 3/22/2017.
 */
public class Multiplication {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 1; i < 11; i++) {
      System.out.println(i + " * " + number + " = " + i * number);
    }
  }
}
