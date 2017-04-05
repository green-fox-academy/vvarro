package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  public List<Plants> plants;

  public void addPlant(Plants plant) {
    plants.add(plant);
  }

  public boolean thirstyPlant(int p) {
    if (plants.get(p).getName() =="Flower" && plants.get(p).getNeedsWater() < 5) {
      return true;
    } else if (plants.get(p).getName() =="Tree" && plants.get(p).getNeedsWater() < 10) {
      return true;
    } else {
      return false;
    }
  }

  public String printOut() {
    String print = "";
    for (int i = 0; i < plants.size(); i++) {
      print = print + ("The " + plants.get(i).getColor() + " " + plants.get(i).getName() + " " + (thirstyPlant(i) ? "needs" : "doesn't need") + " water.\n");
    }
    return print;
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
