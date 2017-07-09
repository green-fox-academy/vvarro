package com.greenfoxacademy.model;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class Meals {
  public Iterable<Meal> meals;

  public Meals() {
    this.meals = new ArrayList<>();
  }

  public Iterable<Meal> getMeals() {
    return meals;
  }

  public void setMeals(Iterable<Meal> meals) {
    this.meals = meals;
  }
}
