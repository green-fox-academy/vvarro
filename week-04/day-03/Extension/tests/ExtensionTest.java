import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ExtensionTest {
  @Test
  void add1() {
  }

  @Test
  public void add() throws Exception {
  }
  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testAddFail() {
    assertEquals(11, extension.add(5,6));
  }

  @Test
  void testMaxOfThreeFail() {
    assertEquals(8, extension.maxOfThree(5, 4, 8));
  }

  @Test
  void testMedianFailOdd() {
    assertEquals(3, extension.median(Arrays.asList(8,3,5,2,1)));
  }

  @Test
  void testMedianFailEven() {
    assertEquals(5, extension.median(Arrays.asList(8,3,5,6)));
  }

  @Test
  void testIsVowelFail() {
    assertTrue(extension.isVowel('k'));
  }

  @Test
  void testTranslateFail() {
    assertEquals("kovolbiviceve", extension.translate("kolbice"));
  }
}