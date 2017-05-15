package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.model.Posts;
import com.greenfoxacademy.reddit.services.PostRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostsController {

  Posts posts;
  PostRepository postRepository;

  public PostsController(PostRepository postRepository) {
    this.postRepository = postRepository;
    this.posts = new Posts();
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public Posts getPosts(Model model) {
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Posts postPost(@RequestBody Post post) {
    postRepository.save(post);
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @RequestMapping(value = "/{id}/upvote", method = RequestMethod.PUT)
  public Posts putPostUpvote(@PathVariable(value = "id", required = true) long id) {
    postRepository.findOne(id).upVote();
    postRepository.save(postRepository.findOne(id));
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @RequestMapping(value = "/{id}/downvote", method = RequestMethod.PUT)
  public Posts putPostDownVote(@PathVariable(value = "id", required = true) long id) {
    postRepository.findOne(id).downVote();
    postRepository.save(postRepository.findOne(id));
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @RequestMapping(value = "", method = RequestMethod.DELETE)
  public Posts deletePost(@RequestParam(value = "message") String received) {
    postRepository.delete(postRepository.findOne(id));
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @ExceptionHandler(IllegalArgumentException.class)
  public com.greenfoxacademy.reddit.controller.ExceptionController getError(
      IllegalArgumentException ex) {
    return new com.greenfoxacademy.reddit.controller.ExceptionController(
        "Please provide an id!");
  }
}
