/**
 * Created by Virág on 4/3/2017.
 */
public class Animal {
  private int hunger;
  private int thirst;

  public Animal(int hunger, int thirst) {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    this.hunger -= 1;
  }

  public void drink() {
    this.thirst-= 1;
  }

  public void play() {
    this.hunger += 1;
    this.thirst += 1;
  }
}
