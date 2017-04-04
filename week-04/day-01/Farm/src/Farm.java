import java.util.ArrayList;
import java.util.List;

public class Farm {
  public List<Animal> farm = new ArrayList();
  public int size = 50;

  public void breed() {
    if (farm.size() < size) {
      for (int i = 0; i < (size - farm.size()) + farm.size(); i++) {
        farm.add(new Animal());
      }
    }
  }

  public void slaughter() {
    int counter = 0;
    int hungerValue = 0;
    for (int i = 0; i < farm.size(); i++) {
      if (farm.get(i).getHunger() > hungerValue) {
        hungerValue = farm.get(i).getHunger();
        counter = i;
      }
    }
    farm.remove(counter);
  }

  public static void main(String[] args) {
    Farm farm1 = new Farm();
    farm1.farm.add(new Animal(10,40));
    farm1.farm.add(new Animal(13,60));
    farm1.farm.add(new Animal(18,30));
    farm1.slaughter();
    farm1.breed();
    System.out.println(farm1.farm.get(1).getHunger());
    }
  }
