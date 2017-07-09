package music;

public class Violin extends StringedInstrument {


  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
  }

  @Override
  public void play() {
    System.out.printf(name + ", a " + numberOfStrings + "-stringed instrument that Screech");
  }
}
