import java.util.Arrays;

/**
 * Created by Virág on 3/29/2017.
 */
public class CompareLenght {
  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5, 6, 7};
    if (p2.length > p1.length ) {
      System.out.println(Arrays.toString(p2));
    }
  }
}
