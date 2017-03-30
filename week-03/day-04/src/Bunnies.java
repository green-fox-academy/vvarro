import java.util.Scanner;

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public class Bunnies {
  public static void main(String[] args) {
    System.out.print("Please give me the number of bunnies:");
    Scanner scanner = new Scanner(System.in);
    int bunny = scanner.nextInt();
    System.out.println(bunnyEars(bunny));
  }

  public static int bunnyEars(int bunny) {
    if (bunny == 1) {
      return 2;
    } else {
      return 2 + bunnyEars(bunny-1);
    }
  }
}
