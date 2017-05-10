package com.greenfoxacademy.frontend.Greeter;

import groovyjarjarcommonscli.MissingArgumentException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
  Greeter greeter;

  @RequestMapping("/greeter")
  public Greeter greeter(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "title", required = true) String title) {
    return new Greeter(name, title);
  }

  @ExceptionHandler(MissingArgumentException.class)
  public com.greenfoxacademy.frontend.Doubling.ExceptionController getError(MissingArgumentException ex){
    return new com.greenfoxacademy.frontend.Doubling.ExceptionController("Please provide a name!");
  }
}
