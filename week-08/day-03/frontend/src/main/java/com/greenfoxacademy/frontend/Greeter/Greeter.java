package com.greenfoxacademy.frontend.Greeter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Greeter {
  String welcome_message;

  public Greeter(){

  }

  public Greeter(String name, String title) {
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

}
