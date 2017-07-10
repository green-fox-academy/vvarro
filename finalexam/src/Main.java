public class Main {

  public static void main(String[] args) {
    LetterFinder letterfinder = new LetterFinder();
    System.out.println(letterfinder.findCharLetter("finalexam", 'a'));
    System.out.println(letterfinder.findCharLetterMethod("finalexam", 'a'));
    System.out.println(letterfinder.findStringLetter("finalexam", "a"));
  }
}
