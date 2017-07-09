package com.greenfoxacademy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Table(name = "mealtype")
@Entity
public class Type {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String name;

  public Type(String name) {
    this.name = name;
  }

  public Type() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
