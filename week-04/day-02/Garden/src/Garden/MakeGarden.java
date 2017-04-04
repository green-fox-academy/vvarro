package Garden;

public class MakeGarden {
  public static void main(String[] args) {
    Garden garden1 = new Garden();
    Flower flower = new Flower();
    garden1.addFlower(flower);
    System.out.println(garden1.plants);
  }
}
