import java.util.Arrays;

public class DiceReroll {
  public void allSix() {
    Dice myDice = new Dice();
    myDice.roll();
    for (int i = 0; i < 6; i++){
      while (myDice.getCurrent(i) != 6){
        myDice.reroll(i);
      }
    }
    System.out.println(Arrays.toString(myDice.dices));
  }
}