/**
 * Created by Virág on 3/21/2017.
 */
public class Cuboid {
  public static void main(String[] args) {
    double l = 40;
    double w = 50;
    double h = 60;
    double surface = 2 * (l * w + w * h + h * l);
    double volume = l * w * h;
    System.out.println("Surface Area: " + (int) surface);
    System.out.println("Volume: " + (int) volume );
  }
}
