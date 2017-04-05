import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountLettersTest {

  @Test
  public void testCountOneLettersValue() throws Exception {
    CountLetters letters = new CountLetters();
    assertEquals("[1]", letters.countLetters("e").values().toString());
  }

  @Test
  public void testCountOneLettersKey() throws Exception {
    CountLetters letters = new CountLetters();
    assertEquals("[e]", letters.countLetters("e").keySet().toString());
  }

  @Test
  public void testCountOneLettersEntrySet() throws Exception {
    CountLetters letters = new CountLetters();
    assertEquals("[e=1]", letters.countLetters("e").entrySet().toString());
  }

  @Test
  public void testCountLettersEntrySet() throws Exception {
    CountLetters letters = new CountLetters();
    assertEquals("[e=2, n=1]", letters.countLetters("ene").entrySet().toString());
  }

}