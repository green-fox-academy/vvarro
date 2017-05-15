package com.greenfoxacademy.iamgroot.controller;

import com.greenfoxacademy.iamgroot.model.GrootMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping("/groot")
  public GrootMessage getMessage(@RequestParam(value = "message") String received){
    GrootMessage grootMessage = new GrootMessage(received);
    return grootMessage;
  }
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public com.greenfoxacademy.iamgroot.controller.ExceptionController getError(
      MissingServletRequestParameterException ex) {
    return new com.greenfoxacademy.iamgroot.controller.ExceptionController(
        "I am Groot!");
  }
}
