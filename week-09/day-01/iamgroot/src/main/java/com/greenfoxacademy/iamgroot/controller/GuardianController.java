package com.greenfoxacademy.iamgroot.controller;

import com.greenfoxacademy.iamgroot.model.CargoStatus;
import com.greenfoxacademy.iamgroot.model.GrootMessage;
import com.greenfoxacademy.iamgroot.model.ShipCargoStatus;
import com.greenfoxacademy.iamgroot.model.YonduArrow;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  ShipCargoStatus shipCargoStatus = new ShipCargoStatus();

  @RequestMapping("/groot")
  public GrootMessage getGrootMessage(@RequestParam(value = "message") String received) {
    GrootMessage grootMessage = new GrootMessage(received);
    return grootMessage;
  }

  @RequestMapping("/yondu")
  public YonduArrow getSpeed(@RequestParam("distance") double distance,
      @RequestParam("time") double time) {
    return new YonduArrow(distance, time);
  }

  @RequestMapping("/rocket")
  public ShipCargoStatus getShipCargoStatus() {
    return shipCargoStatus;
  }

  @RequestMapping("/rocket/fill")
  public CargoStatus getCargoStatus(@RequestParam("caliber") String caliber,
      @RequestParam("amount") double amount) {
    CargoStatus cargoStatus = new CargoStatus(caliber, amount);
    shipCargoStatus.addCaliber(caliber, amount);
    shipCargoStatus.setShipstatus(shipCargoStatus.getShipstatusInt() + ((int)(amount*100)/12500));
    if (shipCargoStatus.getShipstatusInt() >= 12500) {
      shipCargoStatus.setReady(true);
    }
    cargoStatus.setReady(shipCargoStatus.isReady());
    cargoStatus.setShipstatus(shipCargoStatus.getShipstatus());
    return cargoStatus;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public com.greenfoxacademy.iamgroot.controller.ExceptionController getError(
      MissingServletRequestParameterException ex) {
    return new com.greenfoxacademy.iamgroot.controller.ExceptionController(
        "I am Groot!");
  }
}
