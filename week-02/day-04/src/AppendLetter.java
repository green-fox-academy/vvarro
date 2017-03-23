import java.util.*;

/**
 * Created by Virág on 3/23/2017.
 */
public class AppendLetter {
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    String farAdd = new String ();
    int farLength = far.size();
    for (int i = 0; i < farLength; i++) {
      farAdd = far.get(i);
      farAdd = farAdd.concat("a");
      far.set(i, farAdd);
    }
    System.out.println(far);
  }
}