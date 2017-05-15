package com.greenfoxacademy.iamgroot.model;

public class YonduArrow {
  Double distance;
  Double time;
  Double speed;

  public YonduArrow() {

  }

  public YonduArrow(Double distance, Double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance / time;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Double getTime() {
    return time;
  }

  public void setTime(Double time) {
    this.time = time;
  }

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }
}
