package com.greenfoxacademy.connecthtml.controller;

import com.greenfoxacademy.connecthtml.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {
  TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

    @RequestMapping(value ={"","/list"})
  public String list(Model model,  @RequestParam(name = "isActive", required = false) String active) {
    model.addAttribute("active", active);
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }


}
