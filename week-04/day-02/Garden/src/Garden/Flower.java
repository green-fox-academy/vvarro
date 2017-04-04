package Garden;

public class Flower extends Plants {

  public Flower(String color, int needsWater) {
    super(color, needsWater);
    setWaterAmount(0.75);
    setName("Flower");
  }
}
