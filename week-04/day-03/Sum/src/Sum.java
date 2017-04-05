import java.util.List;

public class Sum {

  public Sum(){
  }

  public int sum(List<Integer> numbers){
   int result = 0;
   for (int i : numbers) {
     result += i;
   }
   if (result == 0){
     return 0;
   }
   return result;
  }
}
