package com.greenfoxacademy.programmerfoxclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutritionstore")
  public String changeFood(@ModelAttribute("Food") Food food) throws InterruptedException {
    fox.setFood(food.name);
    System.out.println(fox.getFoodName());
    return "nutritionstore";
  }

  @RequestMapping("/trickcenter")
  public String trickCenter(Model model) {
    model.addAttribute("fox", fox);
    return "trickCenter";
  }
}
