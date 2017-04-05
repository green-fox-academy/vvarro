import java.util.ArrayList;

public class Sum {
  public ArrayList<Integer> numbers;

  public Sum(ArrayList<Integer> numbers){
    this.numbers = new ArrayList<Integer>(numbers);
  }

  public int sum(ArrayList<Integer> numbers){
   int sum = 0;
   for (int i : numbers) {
     sum += numbers.get(i);
   }
   return sum;
  }
}
