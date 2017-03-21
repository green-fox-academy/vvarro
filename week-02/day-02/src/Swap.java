/**
 * Created by Virág on 3/21/2017.
 */
public class Swap {
  public static void main(String[] args) {
    int a = 123;
    int b = 526;
    System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }
}
