package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebGreetCounterController {
  AtomicLong counter = new AtomicLong();
    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
      Greeting greeting = new Greeting(counter.incrementAndGet(), "Hello, " + name + "! This site was loaded " + counter + " times since last server start.");
      model.addAttribute("greeting", greeting.getContent());
      return "greetingv2";
    }
  }
