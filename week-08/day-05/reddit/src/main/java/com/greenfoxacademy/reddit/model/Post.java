package com.greenfoxacademy.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String title;
  String href;
  long timestamp;
  int score;

  public Post() {
    this.timestamp = System.currentTimeMillis() % 1000;
    this.score = 0;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timestamp = System.currentTimeMillis() % 1000;
    this.score = 0;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
