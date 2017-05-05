package com.greenfoxacademy.programmerfoxclub.service;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  public String name;
  public List<Trick> tricks;
  public String food;
  public String drink;

  public Fox(){
    name = "Juniper";
    tricks = new ArrayList<>();
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
    return tricks.size();
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
