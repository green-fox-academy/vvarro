package com.greenfoxacademy.message.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
  @Autowired
  MessageService messageService;

  public void processMessage(String message, String address) {
    messageService.sendingMessage(message, address);
  }
}
