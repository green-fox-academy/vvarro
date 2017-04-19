import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private static final List<Card> Deck = new ArrayList<Card>();

  public Deck() {
    for (Card.Color color : Card.Color.values()) {
      for (Card.Suit suit : Card.Suit.values()) {
        for (Card.Rank rank : Card.Rank.values()) {
          Deck.add(new Card(rank, suit, color));
        }
      }
    }
  }

  public static ArrayList<Card> newDeck() {
    return new ArrayList<Card>(Deck);
  }

  public String toString(){
    return Deck.toString();
  }

  public void shuffleDeck() {
    Collections.shuffle(Deck);
  }

  public Card pullFirst() {
    if (Deck.size() == 0) {
      return null;
    }
    Card removed = Deck.remove(0);
    return removed;
  }

  public Card pullLast() {
    Card removed = Deck.remove(Deck.size()-1);
    return removed;
  }

  public Card pullRandom() {
    Card removed = Deck.remove((int)Math.random()*10);
    return removed;
  }

}
