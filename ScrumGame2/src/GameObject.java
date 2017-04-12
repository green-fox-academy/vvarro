public class GameObject {

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  private int posX;
  private int posY;
  private String costume;

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
  }

  public GameObject() {

  }

  public void move(int x, int y) {
    this.posX = posX + x;
    this.posY = posY + y;
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public String getCostume() {
    return costume;
  }
}
