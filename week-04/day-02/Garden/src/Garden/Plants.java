package Garden;

public class Plants extends Garden {
  private double waterAmount;
  private String color;
  private String name;
  private int needsWater;

  public double getWaterAmount(){
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount){
    this.waterAmount = waterAmount;
  }

  public String getColor(){
    return color;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public double getNeedsWater(){
    return needsWater;
  }

  public void setNeedsWater(int needsWater){
    this.needsWater = needsWater;
  }

  public Plants(String color, int needsWater) {
    this.color = color;
    this.needsWater = needsWater;
  }
}
