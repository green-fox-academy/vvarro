package com.greenfoxacademy.connecthtml.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public Todo(){
    this.isUrgent = false;
    this.isDone = false;
  }

  public Todo(String title) {
    this.title = title;
    isUrgent = false;
    isDone = false;
  }

}