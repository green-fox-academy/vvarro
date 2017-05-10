package com.greenfoxacademy.frontend.Doubling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {
  @Autowired
  Doubling doubling;

  @RequestMapping("/doubling")
  public Doubling doubling(@RequestParam(value = "input", required = true) int input) {
    doubling.setReceived(input);
    return new Doubling(input);
  }
}