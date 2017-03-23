/**
 * Created by Virág on 3/23/2017.
 */
public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(result());
  }

  public void reverse(String reversed) {
    String result="";
    for (int i=reversed.lenght()-1; i>=0; i--) {
      result = result + reversed.charAt(i);
    }

  }
}
