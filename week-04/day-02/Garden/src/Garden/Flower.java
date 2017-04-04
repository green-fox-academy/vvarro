package Garden;

public class Flower extends Plants {

  @Override
  public void watering(int water) {
    if (waterAmount < 5) {
      needsWater = true;
      waterAmount += 0.75*water;
    }
    if (waterAmount >= 5) {
      needsWater = false;
    }
  }

  Flower() {
    super();
  }

  Flower(double waterAmount, boolean needsWater, String color){
    super(waterAmount, needsWater, color);
  }
}
