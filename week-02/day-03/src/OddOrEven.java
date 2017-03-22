import java.util.Scanner;

/**
 * Created by Virág on 3/22/2017.
 */
public class OddOrEven {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if ((number % 2) == 0)
      System.out.println("The number is even");
    else
      System.out.println("The number is odd");
  }
}
