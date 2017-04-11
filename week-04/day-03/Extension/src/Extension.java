import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if ((a > b) && (a > c)) {
      return a;
    } else if ((b > a) && (b > c)) {
      return b;
    } else if ((c > a) && (c > b)) {
      return c;
    } else if ((c == a) && (b > c)) {
      return b;
    } else if ((b == a) && (c > b)) {
      return c;
    } else if ((c == b) && (a > c)) {
      return a;
    } else {
      return c;
    }
  }

  int median(List<Integer> pool) {
    Collections.sort(pool, Comparator.reverseOrder());
    if ((pool.size() % 2) == 0) {
      double poolEven = (double) (((pool.get(pool.size() / 2).intValue()) + ((int) pool.get(pool.size() / 2 + 1).intValue())) / 2);
      int poolIfEven = (int) poolEven;
      return poolIfEven;
    } else {
      return (pool.get((pool.size() - 1) / 2));
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}