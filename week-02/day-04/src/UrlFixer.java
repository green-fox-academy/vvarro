/**
 * Created by Virág on 3/23/2017.
 */
public class UrlFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";
    url = url.replace("https//","https://");
    url = url.replace("bots", "odds");
    System.out.println(url);
  }
}
