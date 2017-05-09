package com.greenfoxacademy.listingtodos.controller;

import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value ={"","/list"}, method = RequestMethod.GET)
  public String list(Model model) {
    return "todolist";
  }

}
