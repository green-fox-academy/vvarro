package com.greenfoxacademy.frontend.DoUntil;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public DoUntil doUntil(@PathVariable(value = "what", required = true) String what,
      @RequestBody Input input) {
    DoUntil doUntil = new DoUntil();
    if (what.equals("sum")) {
      doUntil.sum(input.getUntil());
    } else if (what.equals("factor")) {
      doUntil.factor(input.getUntil());
    }
    return doUntil;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public com.greenfoxacademy.frontend.Doubling.ExceptionController getError(
      MissingServletRequestParameterException ex) {
    return new com.greenfoxacademy.frontend.Doubling.ExceptionController(
        "Please provide a number!");
  }
}
