package com.greenfoxacademy.frontend.AppendA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  @Autowired
  AppendA appendA;

  @RequestMapping("/appenda/{appendable}")
  public AppendA appendA(@PathVariable(value = "appendable", required = true) String appendable) {
    return new AppendA(appendable);
  }
}
