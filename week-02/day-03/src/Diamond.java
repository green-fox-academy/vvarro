import java.util.Scanner;

/**
 * Created by Virág on 3/22/2017.
 */
public class Diamond {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      if (i <= number / 2)
        for (int j = (number / 2 - 1); j >= i; j--) {
          System.out.print(" ");
        }
      else
        for (int j = number + number / 2 + 1; j <= number + i; j++) {
          System.out.print(" ");
        }
      if (i <= number / 2)
        for (int k = 0; k < 2 * i + 1; k++) {
          System.out.print("*");
        }
      else
        for (int k = 0; k < (number - i) + ((number - i) - 1); k++) {
          System.out.print("*");
        }
      System.out.println(" ");
    }
  }
}