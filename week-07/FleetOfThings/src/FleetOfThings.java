public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Things milk = new Things("Get milk");
    Things remove = new Things("Remove the obstacles");
    Things stand = new Things("Stand up");
    Things eat = new Things("Eat lunch");

    fleet.add(milk);
    fleet.add(remove);
    fleet.add(stand);
    fleet.add(eat);

    stand.complete();
    eat.complete();

    System.out.println(fleet);
  }
}