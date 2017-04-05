import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

  @Test
    public void testTrueAnagramMethod() throws Exception {
    Anagram newAnagram = new Anagram("torok", "korot");
    assertTrue(newAnagram.anagram());
  }

  @Test
  public void testFalseAnagramMethod() throws Exception {
    Anagram newAnagram = new Anagram("torok", "torot");
    assertFalse(newAnagram.anagram());
  }
}