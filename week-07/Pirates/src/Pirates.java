import java.util.*;

class Pirates {
  String name;
  boolean hasWoodenLeg;
  int gold;

  Pirates(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;
  }

  static List<String> hasWoodenLegAndGold(List<Pirates> listOfPirates) {
    List<String> listToOutput = new ArrayList<>();
    for (Pirates pirate : listOfPirates) {
      if (pirate.hasWoodenLeg && pirate.gold > 15) {
        listToOutput.add(pirate.name);
      }
    }
    return listToOutput;
  }
}