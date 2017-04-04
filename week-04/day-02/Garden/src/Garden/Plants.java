package Garden;

public class Plants extends Garden {
  public double waterAmount;
  public boolean needsWater;
  public String color;

  public void thirstyPlants() {
    int thirsty = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i)

    }
  }

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
