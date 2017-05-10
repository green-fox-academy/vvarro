package com.greenfoxacademy.frontend.Doubling;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Doubling {
  int received;
  int result;

  public Doubling(){

  }

  public Doubling(int received){
    this.received = received;
    this.result = 2* received;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}

