package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.model.Todo;
import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {
  @Autowired
  TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ListingtodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day"));
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("I have to learn Object Relational Mapping2"));
	}
}
