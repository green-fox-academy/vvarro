package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Meal;
import com.greenfoxacademy.repository.MealRepository;
import com.greenfoxacademy.model.Meals;
import com.greenfoxacademy.model.Response;
import com.greenfoxacademy.model.Statistics;
import com.greenfoxacademy.repository.TypeRepository;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  MealRepository mealRepository;
  TypeRepository typeRepository;
  Meals meals;
  Meal meal;

  public MainRestController(MealRepository mealRepository, TypeRepository typeRepository) {
    this.mealRepository = mealRepository;
    this.meals = new Meals();
    this.meal = new Meal();
    this.typeRepository = typeRepository;
  }

  @GetMapping(value = "/getmeals")
  public Meals setMeals() {
    meals.setMeals(mealRepository.findAll());
    return meals;
  }

  @GetMapping(value = "/getstats")
  public Statistics getStats() {
    meals.setMeals(mealRepository.findAll());
    return new Statistics((List<Meal>) meals);
  }

  @PostMapping(value = "/meal")
  public Response addMeal(@RequestBody Meal meal) {
    mealRepository.save(meal);
    return new Response("ok");
  }

  @PutMapping(value = "/meal")
  public Response updateMeal(@RequestBody Meal meal) {
    mealRepository.findOne(meal.getId());
    meal.setDate(meal.getDate());
    meal.setType(meal.getType());
    meal.setDescription(meal.getDescription());
    meal.setCalories(meal.getCalories());
    mealRepository.save(meal);
    return new Response("ok");
  }

  @DeleteMapping(value = "/meal")
  public Response deleteMeal(@RequestBody Meal meal) {
    mealRepository.delete((meal.getId()));
    return new Response("ok");
  }
}
