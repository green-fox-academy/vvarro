public class Game {
  public static void main(String[] args) {
    Game game = new Game();
    game.play();
    System.out.println();
  }

  public void play() {
    Deck deck = new Deck();
    int randNumber = 15 + (int) (Math.random() * 21);
    int counter = 0;
    while ((counter <= 21) || counter >) {
      counter = counter + (int)deck.pullRandom();
    }
  }
}
