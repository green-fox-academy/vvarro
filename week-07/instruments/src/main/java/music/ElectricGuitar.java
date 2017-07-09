package music;

public class ElectricGuitar extends StringedInstrument {


  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    this.name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.printf(name + ", a " + numberOfStrings + "-stringed instrument that Twang");
  }
}