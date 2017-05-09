package com.greenfoxacademy.listingtodos.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class Todo {
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public Todo(){
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}