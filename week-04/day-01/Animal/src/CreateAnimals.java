/**
 * Created by Virág on 4/3/2017.
 */
public class CreateAnimals {
  public static void main(String[] args) {
    Animal bunny = new Animal();
    System.out.println(bunny.hunger);
    System.out.println(bunny.thirst);
    bunny.eat();
    bunny.drink();
    System.out.println(bunny.hunger);
    System.out.println(bunny.thirst);
    bunny.play();
    System.out.println(bunny.hunger);
    System.out.println(bunny.thirst);
  }
}
