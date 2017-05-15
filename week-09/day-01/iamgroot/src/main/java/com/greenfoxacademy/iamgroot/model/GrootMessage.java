package com.greenfoxacademy.iamgroot.model;

public class GrootMessage {
  String received;
  String translated;

  public GrootMessage(){

  }
  public GrootMessage(String received){
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
