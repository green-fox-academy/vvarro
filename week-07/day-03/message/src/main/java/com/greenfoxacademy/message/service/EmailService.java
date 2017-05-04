package com.greenfoxacademy.message.service;

public class EmailService implements MessageService {

  @Override
  public void sendingMessage(String message, String address) {
    System.out.println("Email message sent to " + address + " with Message=" + message);
  }
}
