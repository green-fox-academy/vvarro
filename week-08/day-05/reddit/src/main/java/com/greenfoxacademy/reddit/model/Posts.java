package com.greenfoxacademy.reddit.model;

import java.util.ArrayList;

public class Posts {
  Iterable<Post> posts;

  public Posts() {
    this.posts = new ArrayList<>();
  }

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
