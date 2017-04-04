public class Counter {
  int value;

  public Counter() {
    this.value = 0;
  }

  public Counter(int field) {
    this.value = field;
  }
  public void add(int number) {
    value += number;
  }

  public void add() {
    value++;
  }

  public int get(){
    return value;
  }

  public void reset(){
    value = 0;
  }

  public void reset(int field){
    value = field;
  }

}

