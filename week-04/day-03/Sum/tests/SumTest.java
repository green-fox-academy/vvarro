import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class SumTest {

  @Test
  public void testSumClass() throws Exception {
    List<Integer> numbers = new ArrayList<Integer>(Arrays.asList());
    Sum newList = new Sum();
    assertEquals(0, newList.sum(numbers));
  }

  @Test
  public void testSumNumbers() throws Exception {
    List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    Sum newList = new Sum();
    assertEquals(15, newList.sum(numbers));
  }

  @Test
  public void testSumOneElement() throws Exception {
    List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1));
    Sum newList = new Sum();
    assertEquals(1, newList.sum(numbers));
  }

}