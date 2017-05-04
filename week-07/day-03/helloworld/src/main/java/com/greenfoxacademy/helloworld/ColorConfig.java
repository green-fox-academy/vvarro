package com.greenfoxacademy.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

  @Bean
  public RedColor redColor() {
    return new RedColor();
  }
}
