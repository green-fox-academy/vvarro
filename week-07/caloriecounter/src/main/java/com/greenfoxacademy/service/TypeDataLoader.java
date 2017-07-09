package com.greenfoxacademy.service;

import com.greenfoxacademy.model.Type;
import com.greenfoxacademy.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TypeDataLoader implements ApplicationRunner {

  @Autowired
  TypeRepository typeRepository;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    typeRepository.save(new Type("Breakfast"));
    typeRepository.save(new Type("Elevenses"));
    typeRepository.save(new Type("Lunch"));
    typeRepository.save(new Type("Snack"));
    typeRepository.save(new Type("Dinner"));
    typeRepository.save(new Type("Midnight Snack"));
  }
}
