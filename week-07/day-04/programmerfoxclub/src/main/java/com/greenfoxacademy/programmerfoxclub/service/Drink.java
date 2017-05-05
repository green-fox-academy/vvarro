package com.greenfoxacademy.programmerfoxclub.service;

public class Drink {
  private static int lastId;
  public String name;
  public int id;

  public Drink(String n) {
    name = n;
    id = lastId;
    lastId++;
  }

  public void setDrink(String name, int id) {
    this.name = name;
    this.id = id;
  }
}
