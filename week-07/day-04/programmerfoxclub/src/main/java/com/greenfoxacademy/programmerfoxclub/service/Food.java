package com.greenfoxacademy.programmerfoxclub.service;

public class Food {
  private static int lastId;
  public String name;
  public int id;

  public Food(String n) {
    name = n;
    id = lastId;
    lastId++;
  }
  
}
