public class GameObject {
  private int posX;
  private int posY;
  private String costume;

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
  }

  public void move() {
    this.posX = get.characterposX;
    this.posY = get.characterposY;
  }
}
