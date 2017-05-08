package com.greenfoxacademy.programmerfoxclub.service;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  public String name;
  public List<Trick> juniperTricks;
  public String food;
  public String drink;

  public Fox(){
    name = "Juniper";
    juniperTricks = new ArrayList<>();
    food = "gummybears";
    drink = "water";
 }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public int getTricksSize() {
    return juniperTricks.size();
  }

  public List<Trick> getTricks() {
    return juniperTricks;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void learnTrick(String trickName) {
    Trick trick = new Trick(trickName);
    juniperTricks.add(trick);
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
