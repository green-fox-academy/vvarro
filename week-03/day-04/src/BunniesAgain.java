import java.util.Scanner;

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
public class BunniesAgain {
  public static void main(String[] args) {
    System.out.print("Please give me the number of bunnies:");
    Scanner scanner = new Scanner(System.in);
    int bunny = scanner.nextInt();
    System.out.println(bunnyEars(bunny));
  }

  public static int bunnyEars(int bunny) {
    if (bunny == 1) {
      return 2;
    } else if (bunny % 2 == 0) {
      return 3 + bunnyEars(bunny - 1);
    } else {
      return 2 + bunnyEars(bunny - 1);
    }
  }
}
