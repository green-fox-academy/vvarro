package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface PostRepository extends CrudRepository<Post, Long> {

}
