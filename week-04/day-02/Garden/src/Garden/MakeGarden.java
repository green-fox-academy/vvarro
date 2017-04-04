package Garden;

public class MakeGarden {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Flower flower1 = new Flower();
    Tree tree1 = new Tree();
    Flower flower2 = new Flower();
    Tree tree2 = new Tree(0.0, "blue", 1);
    garden.addFlower(flower1);
    garden.addFlower(flower2);
    garden.addTree(tree1);
    garden.addTree(tree2);
    System.out.println(tree1.color);
    System.out.println(tree1.needsWater);
    System.out.println(tree1.getNeedsWater());
    System.out.println(garden.plants.size());
    tree2.thirstyPlants();
  }
}
