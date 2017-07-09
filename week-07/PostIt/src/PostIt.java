public class PostIt {
  public String backGround;
  public String text;
  public String textColor;

  PostIt(String backGround, String text, String textColor) {
    this.backGround = backGround;
    this.text = text;
    this.textColor = textColor;
    System.out.println("This is a " + backGround + " post-it with " + textColor + " color text: " + text);
  }
}
