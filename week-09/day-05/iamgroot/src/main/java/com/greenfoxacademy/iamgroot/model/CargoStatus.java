package com.greenfoxacademy.iamgroot.model;

public class CargoStatus {
  String received;
  double amount;
  String shipstatus;
  boolean ready;

  public CargoStatus(String received, double amount) {
    this.received = received;
    this.amount = amount;
    shipstatus = "";
    ready = false;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
