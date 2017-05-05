package com.greenfoxacademy.programmerfoxclub.service;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Fox {

  String name;
  List<Trick> tricks;
  Food food;
  Drink drink;

 public Fox(){
    name = "Juniper";
    tricks = new ArrayList<>();
    food = new Food("gummybears");
    drink = new Drink("water");
  }

  public String getFoodName(){
   return food.name;
  }

  public String getDrinkName(){
    return drink.name;
  }

  public int getTricksSize() {
    return tricks.size();
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setFood(String name){
    Food food = new Food(name);
  }

  public void setDrink(String name){
    Drink drink = new Drink(name);
  }

}
