package com.greenfoxacademy.lionking.controllers;

import com.greenfoxacademy.lionking.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/excersise1")
  public String getBankAccount(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getAnimalType());
    return "bankaccount";
  }

  @RequestMapping("/excersise2")
  public String decimals(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getAnimalType());
    return "bankaccount2";
  }

  @RequestMapping("/excersise3")
  public String zebra(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getAnimalType());
    return "bankaccount3";
  }

  @RequestMapping("/excersise4")
  public String submitText(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "bankaccount4";
  }

  @RequestMapping("/excersise5")
  public String arrayList(Model model) {
    List<BankAccount> characters = new ArrayList<>();
    characters.add(new BankAccount("Nala", 3000, "lion" ));
    characters.add(new BankAccount("Mufasa", 8000, "lion" ));
    characters.add(new BankAccount("Timon", 2000, "meerkat" ));
    characters.add(new BankAccount("Pumbaa", 1000, "warthog" ));
    model.addAttribute("name", characters.get(1).getName());
    model.addAttribute("balance", characters.get(1).getBalance());
    model.addAttribute("type", characters.get(1).getAnimalType());
    return "bankaccount5";
  }

  @RequestMapping("/excersise6")
  public String id1(Model model) {
    List<BankAccount> characters = new ArrayList<>();
    characters.add(new BankAccount("Nala", 3000, "lion" ));
    characters.add(new BankAccount("Mufasa", 8000, "lion" ));
    characters.add(new BankAccount("Timon", 2000, "meerkat" ));
    characters.add(new BankAccount("Pumbaa", 1000, "warthog" ));
    model.addAttribute("name", characters.get(1).getName());
    model.addAttribute("balance", characters.get(1).getBalance());
    model.addAttribute("type", characters.get(1).getAnimalType());
    model.addAttribute("index", characters.indexOf(characters.get(1)));
    return "bankaccount6";
  }

  @RequestMapping("/excersise62")
  public String id2(Model model) {
    List<BankAccount> characters = new ArrayList<>();
    characters.add(new BankAccount("Nala", 3000, "lion" ));
    characters.add(new BankAccount("Mufasa", 8000, "lion" ));
    characters.add(new BankAccount("Timon", 2000, "meerkat" ));
    characters.add(new BankAccount("Pumbaa", 1000, "warthog" ));
    model.addAttribute("characters",characters);
    return "bankaccount62";
  }

  @RequestMapping("/excersise7")
  public String isKing(Model model) {
    List<BankAccount> characters = new ArrayList<>();
    characters.add(new BankAccount("Nala", 3000, "lion" ));
    characters.add(new BankAccount("Mufasa", 8000, "lion" ));
    characters.add(new BankAccount("Timon", 2000, "meerkat" ));
    characters.add(new BankAccount("Pumbaa", 1000, "warthog" ));
    model.addAttribute("characters",characters);
    return "bankaccount7";
  }

  @RequestMapping("/excersise8")
  public String isBadGuy(Model model) {
    List<BankAccount> characters = new ArrayList<>();
    characters.add(new BankAccount("Nala", 3000, "lion" ));
    characters.add(new BankAccount("Mufasa", 8000, "lion" ));
    characters.add(new BankAccount("Timon", 2000, "meerkat" ));
    characters.add(new BankAccount("Pumbaa", 1000, "warthog" ));
    model.addAttribute("characters",characters);
    return "bankaccount8";
  }

  @RequestMapping("/excersise9")
  public String isBadGuySwitch(Model model) {
    List<BankAccount> characters = new ArrayList<>();
    characters.add(new BankAccount("Nala", 3000, "lion" ));
    characters.add(new BankAccount("Mufasa", 8000, "lion" ));
    characters.add(new BankAccount("Timon", 2000, "meerkat" ));
    characters.add(new BankAccount("Pumbaa", 1000, "warthog" ));
    model.addAttribute("characters",characters);
    return "bankaccount9";
  }
}
