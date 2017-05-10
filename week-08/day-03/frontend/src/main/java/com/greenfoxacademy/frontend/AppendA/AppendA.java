package com.greenfoxacademy.frontend.AppendA;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class AppendA {
  String appended;

  public AppendA(){

  }
  public AppendA(String appendable){
    appended = appendable + "a";
  }
}
