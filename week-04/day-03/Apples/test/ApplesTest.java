import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ApplesTest {
  @Test
  public void testGetApple() throws Exception {
    Apples apple = new Apples("apple");
    assertEquals("apple", apple.getApples());
  }
}