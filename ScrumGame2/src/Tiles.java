public class Tiles extends GameObject {
boolean isWall;
  public Tiles(int posX, int posY, String costume, boolean isWall) {
    super(posX, posY, costume);
    this.isWall = isWall;
  }
}
