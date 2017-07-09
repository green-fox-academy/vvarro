package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface TypeRepository extends CrudRepository<Type, Long> {

}
