package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Meal;
import com.greenfoxacademy.model.Meals;
import com.greenfoxacademy.model.Statistics;
import com.greenfoxacademy.model.Type;
import com.greenfoxacademy.repository.MealRepository;
import com.greenfoxacademy.repository.TypeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  MealRepository mealRepository;
  @Autowired
  Meals meals;
  @Autowired
  TypeRepository typeRepository;

  @RequestMapping("/")
  public String index(Model model) {
    meals.setMeals(mealRepository.findAll());
    List<Meal> mealList = new ArrayList<>();
    for (Meal meal : meals.getMeals()) {
      mealList.add(meal);
    }
    model.addAttribute("statistics", new Statistics(mealList));
    model.addAttribute("meals", mealList);
    return "index";
  }

  @RequestMapping("/add")
  public String addFoodPage(Model model) {
    List<Type> types = (List<Type>) typeRepository.findAll();
    Meal meal = new Meal();
    model.addAttribute("meal", meal);
    model.addAttribute("types", types);
    model.addAttribute("errors", "");
    return "add";
  }

  @PostMapping("/add")
  public String addFood(Model model,
      @RequestParam(value = "action", required = true) String action,
      @RequestParam(value = "date", required = true) String date,
      @RequestParam(value = "type", required = true) String type,
      @RequestParam(value = "description", required = false) String description,
      @RequestParam(value = "calories", required = true) int calories) {
    if (action.equals("save")) {
      Meal meal = new Meal(date, type, description, calories);
      List<String> errors = new ArrayList<>();
      if (meal.getDate().equals("")) {
        errors.add("date");
      }
      if (meal.getType().equals("")) {
        errors.add(" type");
      }
      if (meal.getCalories() == 0) {
        errors.add("calories");
      }
      if (errors.size() == 0) {
        mealRepository.save(meal);
        return "redirect:/";
      } else {
        model.addAttribute("meal", meal);
        model.addAttribute("errors", String.join(", ", errors));
        List<Type> types = (List<Type>) typeRepository.findAll();
        model.addAttribute("types", types);
        return "add";
      }
    }
    return "redirect:/";
  }

  @RequestMapping("/edit")
  public String editFoodPage(Model model, @RequestParam(value = "id") String id) {
    List<Type> types = (List<Type>) typeRepository.findAll();
    Meal meal = mealRepository.findOne(Long.valueOf(id));
    model.addAttribute("meal", meal);
    model.addAttribute("types", types);
    model.addAttribute("errors", "");
    return "edit";
  }

  @PostMapping("/edit")
  public String editFood(Model model,
      @RequestParam(value = "id", required = true) String id,
      @RequestParam(value = "action", required = true) String action,
      @RequestParam(value = "date", required = true) String date,
      @RequestParam(value = "type", required = true) String type,
      @RequestParam(value = "description", required = false) String description,
      @RequestParam(value = "calories", required = true) int calories) {

    if (action.equals("save")) {
      Meal meal = mealRepository.findOne(Long.valueOf(id));
      meal.setDate(date);
      meal.setType(type);
      meal.setDescription(description);
      meal.setCalories(calories);
      List<String> errors = new ArrayList<>();
      if (meal.getDate().equals("")) {
        errors.add("date");
      }
      if (meal.getType().equals("")) {
        errors.add(" type");
      }
      if (meal.getCalories() == 0) {
        errors.add("calories");
      }
      if (errors.size() == 0) {
        mealRepository.save(meal);
        return "redirect:/";
      } else {
        model.addAttribute("meal", meal);
        model.addAttribute("errors", String.join(", ", errors));
        List<Type> types = (List<Type>) typeRepository.findAll();
        model.addAttribute("types", types);
        return "edit";
      }

    }
    return "redirect:/";
  }

  @PostMapping("/delete/{id}")
  public String deleteMeal(@PathVariable(value = "id") long id) {
    mealRepository.delete(mealRepository.findOne(id));
    return "redirect:/";
  }
}
