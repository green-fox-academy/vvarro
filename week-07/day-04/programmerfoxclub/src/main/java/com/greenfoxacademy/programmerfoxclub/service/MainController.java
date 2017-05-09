package com.greenfoxacademy.programmerfoxclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Fox fox;
  TrickList trickList;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutritionstore")
  public String nutritionstore(Model model) {
    model.addAttribute("fox", fox);
    return "nutritionstore";
  }

  @PostMapping("/addnutrition")
  public String addNutrition(@RequestParam("food") String food,
      @RequestParam("drink") String drink) {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }

  @RequestMapping("/trickcenter")
  public String trickCenter(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("tricklist", trickList);
    return "trickcenter";
  }

  @PostMapping("/learntrick")
  public String learnTrick(@RequestParam("trick") String trick) {
    fox.learnTrick(trick);
    return "redirect:/trickcenter";
  }
}
