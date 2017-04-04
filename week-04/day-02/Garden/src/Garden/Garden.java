package Garden;

import java.util.ArrayList;

public class Garden {
  public int numberOfFlowers;
  public int numberOfTrees;
  public ArrayList plants;

  public void addFlower(Flower flower){
      plants.add(flower);
    }

  public void addTree(Tree tree){
      plants.add(tree);
    }

    Garden() {
      this.numberOfFlowers = 0;
      this.numberOfTrees = 0;
      this.plants = new ArrayList<Plants>();
    }

      Garden(int numberOfFlowers, int numberOfTrees){
        this.numberOfFlowers = numberOfFlowers;
        this.numberOfTrees = numberOfTrees;
        this.plants = new ArrayList<Plants>();
    }
  }
