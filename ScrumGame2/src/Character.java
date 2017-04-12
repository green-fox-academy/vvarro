public class Character extends GameObject {
  public Character(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  public Character() {
  }

  private void moveUp() {
    if ((GameMap.mapStructure[getPosY() / 72 - 1][getPosX() / 72] != 0) && (getPosY() - 72 >= 0)) {
      move(0, -72);
    }
  }

  private void moveDown() {
    if ((GameMap.mapStructure[getPosY() / 72 + 1][getPosX() / 72] != 0) && (getPosY() + 72 < 720)) {
      move(0, +72);
    }
  }

  private void moveLeft() {
    if ((GameMap.mapStructure[getPosY() / 72][getPosX() / 72 - 1] != 0) && (getPosX() - 72 >= 0)) {
      move(-72, 0);
    }
  }

  private void moveRight() {
    if ((GameMap.mapStructure[getPosY() / 72][getPosX() / 72 + 1] != 0) && (getPosX() + 72 < 720)) {
      move(+72, 0);
    }
  }
}
