package com.greenfoxacademy.lionking.controllers;

import com.greenfoxacademy.lionking.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");

  @RequestMapping
  public String bankAccount(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getAnimalType());
    return "bankaccount";
  }
}
