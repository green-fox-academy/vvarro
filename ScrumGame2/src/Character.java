public class Character extends GameObject {
  public Character(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  private void moveUp(){
    if (GameMap.mapStructure[getPosY() / 72 - 1][getPosX() / 72] != 0) {
      getPosY() -= 72;
      move;
    }


  }

  private void moveDown(){

  }

  private void moveLeft(){

  }

  private void moveRight(){

  }
}
