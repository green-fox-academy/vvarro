import java.util.Scanner;

// Write a recursive function that takes one parameter: n and counts down from n.
public class Counter {
  public static void main(String[] args) {
    System.out.println("Please give me a number:");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(countDown(n));
  }

  public static int countDown(int num) {
    if (num == 0) {
      return 0;
    } else {
      System.out.println(num);
      return countDown(num - 1);
    }
  }
}