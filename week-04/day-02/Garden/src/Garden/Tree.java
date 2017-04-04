package Garden;

public class Tree extends Plants {

  Tree(String color, int needsWater){
    super(color, needsWater);
    setWaterAmount(0.4);
    setName("Tree");
  }
}