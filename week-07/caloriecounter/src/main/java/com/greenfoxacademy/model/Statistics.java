package com.greenfoxacademy.model;

import java.util.List;

public class Statistics {
    public int numberOfMeals;
    public int totalCalories;

    public Statistics(List<Meal> meals) {
      this.numberOfMeals = meals.size();
      this.totalCalories = getTotalCalories(meals);
    }

    public int getTotalCalories(List<Meal> meals) {
      int calories = 0;
      for(Meal meal : meals) {
        calories += meal.getCalories();
      }
      return calories;
    }

  public int getNumberOfMeals() {
    return numberOfMeals;
  }

  public void setNumberOfMeals(int numberOfMeals) {
    this.numberOfMeals = numberOfMeals;
  }

  public int getTotalCalories() {
    return totalCalories;
  }

  public void setTotalCalories(int totalCalories) {
    this.totalCalories = totalCalories;
  }
}
