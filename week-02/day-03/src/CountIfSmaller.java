import java.util.Scanner;

/**
 * Created by Virág on 3/22/2017.
 */
public class CountIfSmaller {
  public static void main(String[] args) {
    System.out.println("Enter the first number: ");
    Scanner firstScanner = new Scanner(System.in);
    int firstNumber = firstScanner.nextInt();
    System.out.println("Enter the second number: ");
    Scanner secondScanner = new Scanner(System.in);
    int secondNumber = secondScanner.nextInt();
    if (firstNumber >= secondNumber)
      System.out.println("The second number should be bigger");
    else
      for (int i = firstNumber; i < secondNumber; i++) {
        System.out.println(i);
      }
  }
}
