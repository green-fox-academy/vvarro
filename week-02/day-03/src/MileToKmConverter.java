import java.util.Scanner;

/**
 * Created by Virág on 3/22/2017.
 */
public class MileToKmConverter {
  public static void main(String[] args) {
    System.out.println("Distance in km: ");
    Scanner scanner = new Scanner(System.in);
    int distanceKm = scanner.nextInt();
    System.out.println("Distance in miles: " + 0.621371192 * distanceKm);
  }
}