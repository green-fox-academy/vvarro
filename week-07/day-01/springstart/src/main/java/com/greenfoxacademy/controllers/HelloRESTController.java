package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong();
  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name){
    Greeting greeting = new Greeting(counter.incrementAndGet(), "Hello, " + name + "!");
    return greeting;
  }
}
