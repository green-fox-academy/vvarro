import java.util.ArrayList;
import java.util.List;

public class Seconds2 {
  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
    List<Integer> initList = new ArrayList<>();
    for (int i = 1; i < 6; i++) {
      initList.add(i);
    }

    System.out.println(initList);
    System.out.println(everySecond(initList));
  }

  public static List<Integer> everySecond(List<Integer> initList) {
    List<Integer> everySecondList = new ArrayList<Integer>();
    for (int i = 1; i < initList.size(); i += 2) {
      everySecondList.add(initList.get(i));
    }
    return everySecondList;
  }
}
