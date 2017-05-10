package com.greenfoxacademy.frontend.DoUntil;

public class DoUntil {

  private int result;

  public DoUntil() {

  }

  public void sum(int until) {
    for (int i = 0; i < until; i++) {
      result = result + (until - i);
    }
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void factor(int until) {
    result = 1;
    for (int i = 1; i < until + 1; i++) {
      result = result * i;
    }
    this.result = result;
  }
}
