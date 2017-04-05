public class Anagram {
  String input1;
  String input2;

  public Anagram (String input1, String input2) {
    this.input1 = input1;
    this.input2 = input2;
  }

  public boolean anagram() {
    int length = input1.length();
    String reversedFirst = "";
    for (int i = length - 1; i >= 0; i--) {
      reversedFirst = reversedFirst + input1.charAt(i);
    }
    if (reversedFirst.equals(input2)) {
      return true;
    } else {
      return false;
    }
  }
}
