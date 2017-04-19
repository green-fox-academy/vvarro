public class Game {
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);
    deck.shuffleDeck();
    System.out.println(deck);
    deck.pullFirst();
    System.out.println(deck);
    deck.pullLast();
    System.out.println(deck);
  }
}
