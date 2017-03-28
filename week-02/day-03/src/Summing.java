import java.util.Scanner;

public class Summing {
  public static void main(String[] args) {
    System.out.println("Please give me a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(summary(number));
  }

  public static int summary(int number) {
    int summary = 0;
    for (int i = 0; i <= number; i++) {
      summary = summary + i;
    }
    return summary;
  }
}

