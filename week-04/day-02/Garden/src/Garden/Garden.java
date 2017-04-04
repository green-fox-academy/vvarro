package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  public List<Plants> plants;

  public void addPlant(Plants plant) {
    plants.add(plant);
  }

  public boolean thirstyPlant(int i) {
    if (plants.get(i) instanceof Flower && plants.get(i).getNeedsWater() < 5) {
      return true;
    } else if (plants.get(i) instanceof Tree && plants.get(i).getNeedsWater() < 10) {
      return true;
    } else {
      return false;
    }
  }

  public void printOut() {
    for (int i = 0; i < plants.size(); i++) {
      System.out.println("The " + plants.get(i).getColor() + " " + plants.get(i).getName() + " " + (thirstyPlant(i) ? "needs" : "doesn't need") + " water.\n");
    }
  }

  public void water(double amount) {
    System.out.println("Watering with " + amount + " water.");
    int counter = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (thirstyPlant(i)) {
        counter += 1;
      }
    }
    for (int i = 0; i < plants.size(); i++) {
      if (thirstyPlant(i)){
        double newAmount = plants.get(i).getNeedsWater() + amount/counter*plants.get(i).getWaterAmount();
        plants.get(i).setWaterAmount(newAmount);
      }
    }
  }

  public Garden() {
    this.plants = new ArrayList<>();
  }
}
