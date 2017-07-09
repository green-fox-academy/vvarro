package music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    this.name = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.printf(name + ", a " + numberOfStrings + "-stringed instrument that Duum-duum-duum");
  }
}
