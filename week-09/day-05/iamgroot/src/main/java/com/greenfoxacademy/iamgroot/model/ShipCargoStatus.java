package com.greenfoxacademy.iamgroot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

@Component
public class ShipCargoStatus {

  int caliber25;
  int caliber30;
  int caliber50;
  int shipstatus;
  boolean ready;

  public boolean isReady() {
    return ready;
  }

  public ShipCargoStatus() {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    shipstatus = 0;
  }

  public void addCaliber(String caliber, double amount) {
    if (caliber.equals(".25")) {
      caliber25 += amount;
    } else if (caliber.equals(".30")) {
      caliber30 += amount;
    } else if (caliber.equals(".50")) {
      caliber50 += amount;
    }
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipstatus() {
    String shipStatusString = "";
    if (shipstatus == 0) {
      shipStatusString = "empty";
    } else if ((shipstatus > 0) && (shipstatus < 100)) {
      shipStatusString = String.valueOf(shipstatus) + "%";
    } else if (shipstatus == 100) {
      shipStatusString = "full";
    } else if (shipstatus > 100) {
      shipStatusString = "overloaded";
    }
    return shipStatusString;
  }

  @JsonIgnore
  public int getShipstatusInt() {
    return shipstatus;
  }

  public void setShipstatus(int shipstatus) {
    this.shipstatus = shipstatus;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
