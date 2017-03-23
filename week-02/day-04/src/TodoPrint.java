/**
 * Created by Virág on 3/23/2017.
 */
public class TodoPrint {
  public static void main(String... args) {
    String todoText = " - Buy milk\n";
    todoText = "My list:\n" + todoText;
    todoText = todoText + " " + ("- Download games\n");
    todoText = todoText + "   " + ("- Diablo\n");
    System.out.println(todoText);
  }
}
