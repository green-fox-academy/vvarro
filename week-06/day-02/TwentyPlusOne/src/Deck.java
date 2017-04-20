import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  private static final List<Card> Deck = new ArrayList<Card>();

  public Deck() {
    for (Card.Suit suit : Card.Suit.values()) {
      for (Card.Rank rank : Card.Rank.values()) {
        if ((suit.equals(Card.Suit.DIAMONDS)) | (suit.equals(Card.Suit.HEARTS))) {
          Deck.add(new Card(rank, suit, Card.Color.RED));
        } else if ((suit.equals(Card.Suit.CLUBS)) | (suit.equals(Card.Suit.SPADES))) {
          Deck.add(new Card(rank, suit, Card.Color.BLACK));
        }
      }
    }
  }

  public static ArrayList<Card> newDeck() {
    return new ArrayList<Card>(Deck);
  }

  public String toString() {
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
    Card removed = Deck.remove(Deck.size() - 1);
    return removed;
  }

  public Card.Rank[] pullRandom() {
    Card removed = Deck.remove((int) Math.random() * 10);
    return Card.Rank.values();
  }

}
