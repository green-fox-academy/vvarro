import java.util.Scanner;

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
public class Power {
  public static void main(String[] args) {
    System.out.print("Please give me the base number greater than 1: ");
    Scanner scanner1 = new Scanner(System.in);
    int base = scanner1.nextInt();
    System.out.print("Please give me the power number greater than 1: ");
    Scanner scanner2 = new Scanner(System.in);
    int n = scanner2.nextInt();
    System.out.println(powerN(base,n));
  }

  public static int powerN(int base, int n) {
    if (n == 1) {
      return base;
    } else {
      return  base * powerN(base, n-1);
    }
  }
}
