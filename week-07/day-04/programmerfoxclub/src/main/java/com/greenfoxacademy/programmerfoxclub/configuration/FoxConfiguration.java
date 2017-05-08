package com.greenfoxacademy.programmerfoxclub.configuration;

import com.greenfoxacademy.programmerfoxclub.service.Fox;
import com.greenfoxacademy.programmerfoxclub.service.TrickList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfiguration {

  @Bean
  public Fox fox(){
    return new Fox();
  }

  @Bean
  public TrickList trickList(){
    return new TrickList();
  }

  @Bean
  public TrickList juniperTrickList(){
    return new TrickList();
  }
}
