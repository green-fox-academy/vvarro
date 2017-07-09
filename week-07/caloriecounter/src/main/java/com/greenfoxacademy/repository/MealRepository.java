package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface MealRepository extends CrudRepository<Meal, Long> {

}
