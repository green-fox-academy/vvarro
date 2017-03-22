/**
 * Created by Virág on 3/22/2017.
 */
public class Kutya {
  public static void main(String[] args) {
    StringBuilder am = new StringBuilder("kuty");
    appendA(am);
  }
  public static void appendA(StringBuilder am) {
    am.append("a");
    System.out.println(am);
  }
}
