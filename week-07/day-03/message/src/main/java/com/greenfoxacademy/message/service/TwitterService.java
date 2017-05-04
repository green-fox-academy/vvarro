package com.greenfoxacademy.message.service;

public class TwitterService implements MessageService {

  @Override
  public void sendingMessage(String message, String address) {
    System.out.println("Twitter message sent to " + address + " with Message=" + message);
  }
}
