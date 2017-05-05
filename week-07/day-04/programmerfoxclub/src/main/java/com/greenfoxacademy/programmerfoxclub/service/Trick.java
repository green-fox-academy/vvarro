package com.greenfoxacademy.programmerfoxclub.service;

public class Trick {
  private static int lastId;
  public String name;
  public int id;

  public Trick(String n) {
    name = n;
    id = lastId;
    lastId++;
  }
}
