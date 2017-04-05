import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

  @Test
  public void testFibonacci1() throws Exception {
    Fibonacci fibonacci = new Fibonacci(1);
    assertEquals(0, fibonacci.newList(1));
  }

  @Test
  public void testFibonacci2() throws Exception {
    Fibonacci fibonacci = new Fibonacci(2);
    assertEquals(1, fibonacci.newList(2));
  }

  @Test
  public void testFibonacci3() throws Exception {
    Fibonacci fibonacci = new Fibonacci(3);
    assertEquals(1, fibonacci.newList(3));
  }

  @Test
  public void testFibonacci4() throws Exception {
    Fibonacci fibonacci = new Fibonacci(4);
    assertEquals(2, fibonacci.newList(4));
  }

  @Test
  public void testFibonacci5() throws Exception {
    Fibonacci fibonacci = new Fibonacci(5);
    assertEquals(3, fibonacci.newList(5));
  }

}