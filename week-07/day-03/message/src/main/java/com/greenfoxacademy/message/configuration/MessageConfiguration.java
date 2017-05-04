package com.greenfoxacademy.message.configuration;

import com.greenfoxacademy.message.service.MessageProceeder;
import com.greenfoxacademy.message.service.MessageService;
import com.greenfoxacademy.message.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  // public MessageService messageService(){
  //   return new EmailService();
  // }

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

  @Bean
  public MessageService messageService() {
    return new TwitterService();
  }
}
