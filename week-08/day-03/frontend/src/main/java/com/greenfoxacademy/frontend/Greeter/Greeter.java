package com.greenfoxacademy.frontend.Greeter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeter {
  String welcome_message;

  public Greeter(String welcome_message){
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
