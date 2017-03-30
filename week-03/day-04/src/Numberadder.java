// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
import java.util.Scanner;

public class Numberadder {
public static void main(String[] args) {
  System.out.print("Please give me a number: ");
  Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  System.out.println(sum(n));
}

  public static int sum(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + sum(n - 1);
    }
  }
}
