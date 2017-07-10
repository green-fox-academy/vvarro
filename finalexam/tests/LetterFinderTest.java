import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterFinderTest {
  LetterFinder letterFinder = new LetterFinder();

  @Test
  public void findCharLetter() throws Exception {
    assertEquals(2, (int)letterFinder.findCharLetter("alma", 'm').get(0));
  }

  @Test
  public void findCharLetterMethod() throws Exception {
    assertEquals(2, (int)letterFinder.findCharLetter("alma", 'm').get(0));
  }

  @Test
  public void findStringLetter() throws Exception {
    assertEquals(2, (int)letterFinder.findCharLetter("alma", 'm').get(0));
  }

}
