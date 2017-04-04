
public class Sharpie {
  String color;
  double width;
  double inkAmount;

  public void use() {
    inkAmount -= 5;
  }

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100.0;
  }
}
