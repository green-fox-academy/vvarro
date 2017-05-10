package com.greenfoxacademy.frontend.Greeter;

import com.greenfoxacademy.frontend.Doubling.ExceptionController;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @RequestMapping("/greeter")
  public Greeter getWelcomeMessage (@RequestParam(value = "name", required = true) String name, @RequestParam(value = "title", required = true) String title) {
    return new Greeter("Oh, hi there " + name + ", " + "my dear " + title + "!");
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ExceptionController getError(MissingServletRequestParameterException ex){
    String name = ex.getParameterName();
    return new ExceptionController("Please provide a " + name + "!");
  }
}
