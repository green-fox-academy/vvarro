import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    orderDomino(dominoes);
    System.out.println(dominoes);
  }

  public static void orderDomino(List<Domino> dominoes){
    Domino temp = dominoes.get(0);
    dominoes.set(0, dominoes.get(2));
    dominoes.set(2, dominoes.get(4));
    dominoes.set(4, dominoes.get(3));
    dominoes.set(3, dominoes.get(1));
    dominoes.set(1, temp);
    System.out.println(dominoes.toString());
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}