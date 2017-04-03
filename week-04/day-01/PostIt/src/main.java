
public class main {
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt("orange", "Idea1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awsome", "black");
    PostIt postIt3 = new PostIt("yellow", "Superb!", "green");
    System.out.println(postIt1.text);
    System.out.println(postIt2.text);
    System.out.println(postIt3.text);
  }
}