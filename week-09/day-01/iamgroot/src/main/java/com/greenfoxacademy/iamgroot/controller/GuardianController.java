package com.greenfoxacademy.iamgroot.controller;

import com.greenfoxacademy.iamgroot.model.GrootMessage;
import com.greenfoxacademy.iamgroot.model.YonduArrow;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping("/groot")
  public GrootMessage getGrootMessage(@RequestParam(value = "message") String received) {
    GrootMessage grootMessage = new GrootMessage(received);
    return grootMessage;
  }

  @RequestMapping("/yondu")
  public YonduArrow getSpeed(@RequestParam(value = "distance") Double distance,
      @RequestParam(value = "time") Double time) {
    YonduArrow yonduArrow = new YonduArrow(distance, time);
    return yonduArrow;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public com.greenfoxacademy.iamgroot.controller.ExceptionController getError(
      MissingServletRequestParameterException ex) {
    return new com.greenfoxacademy.iamgroot.controller.ExceptionController(
        "I am Groot!");
  }
}
