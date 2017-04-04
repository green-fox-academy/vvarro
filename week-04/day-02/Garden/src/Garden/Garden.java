package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  public List<Plants> plants;

  public void addPlant(Plants plant) {
    plants.add(plant);
  }

  public int thirstyPlant() {
    int numThirsty = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Flower && plants.get(i).getNeedsWater() < 5) {
        numThirsty += 1;
      } else if (plants.get(i) instanceof Tree && plants.get(i).getNeedsWater() < 10) {
        numThirsty += 1;
      }
    }
    return numThirsty;
  }


  public void addTree(Tree tree) {
    plants.add(new Tree());
  }

  Garden() {
    this.plants = new ArrayList<Plants>();
  }

  Garden(int numberOfFlowers, int numberOfTrees) {
    this.plants = new ArrayList<Plants>();
  }
}
