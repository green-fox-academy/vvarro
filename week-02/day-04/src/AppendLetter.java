import java.util.*;
/**
 * Created by Virág on 3/23/2017.
 */
public class AppendLetter{
  public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    for (String i : far) {
      far.add(i+"a");
    }
    System.out.println(far);
  }
}