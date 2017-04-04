package Garden;

public class Tree extends Plants {

  @Override
  public void watering(int water) {
    if (waterAmount < 10) {
      needsWater = true;
      waterAmount += 0.4 * water;
    }
    if (waterAmount >= 10) {
      needsWater = false;
    }
  }

  Tree() {
    super();
  }

  Tree(double waterAmount, boolean needsWater, String color){
    super(waterAmount, needsWater, color);
  }
}