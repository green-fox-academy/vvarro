
public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(rev(reversed));
  }

  public static String rev(String reversed) {
    int length = reversed.length();
    String a = "";
    for (int i = length - 1; i >= 0; i--) {
      a = a + reversed.charAt(i);
    }
    return a;
    }
  }
