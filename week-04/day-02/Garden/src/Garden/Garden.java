package Garden;

import java.util.ArrayList;

public class Garden {
  public ArrayList plants;

  public void addFlower(Flower flower){
      plants.add(flower);
    }

  public void addTree(Tree tree){
      plants.add(tree);
    }



    Garden() {
      this.plants = new ArrayList<Plants>();
    }

      Garden(int numberOfFlowers, int numberOfTrees){
        this.plants = new ArrayList<Plants>();
    }
  }
