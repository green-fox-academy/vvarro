import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertNull;

public class SumTest {

  @Test
  public void testSumClass() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>();
    Sum newList = new Sum(numbers);
    assertNull(newList);
  }

}