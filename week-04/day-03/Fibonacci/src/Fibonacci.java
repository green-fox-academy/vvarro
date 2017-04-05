public class Fibonacci {
  int n;
  public Fibonacci(int n){
    this.n = n;
  }

  public long newList(int n) {
    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    } else {
      return newList(n - 1) + newList(n - 2);
    }
  }
}
