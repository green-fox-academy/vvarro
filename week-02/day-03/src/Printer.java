/**
 * Created by Virág on 3/29/2017.
 */
public class Printer {
  public static void main(String[] args) {
    String[] stringArray = {"first", "second", "third"};
    printer(stringArray);
  }

  public static void printer(String[] stringArray){
    for (int i = 0; i < stringArray.length; i++ ) {
      System.out.print(stringArray[i] + " ");
    }
  }
}
