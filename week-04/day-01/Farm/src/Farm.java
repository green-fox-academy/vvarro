public class Farm {
  int size;

  Farm() {
    this.size = 50;
  }

  Farm(int size) {
    this.size = size;
  }

  public void breed() {
    if (size <= 50) {
      new Animal();
      size -= 1;
    }
  }

  public void slaughter() {

  }

  public static void main(String[] args) {
    Farm farm = new Farm();
    for (int i = 0; i < 30; i++) {
      farm.breed();
    }
      System.out.println(farm.size);
    }
  }
