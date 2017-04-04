package Garden;

public class Plants {
  public double waterAmount;
  public boolean needsWater;
  public String color;


  public void watering(int water) {
    if (needsWater = true) {
      waterAmount += water;
    }
    if (waterAmount >= 10) {
      needsWater = false;
    }
  }

  Plants() {
    this.waterAmount = 0;
    this.needsWater = true;
    this.color = "yellow";
  }

  Plants(double waterAmount, boolean needsWater, String color){
    this.waterAmount = waterAmount;
    this.needsWater = needsWater;
    this.color = color;
  }

}
