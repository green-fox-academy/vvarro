package com.greenfoxacademy.reddit.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  String href;
  Timestamp timestamp;
  int score;

  public Post() {
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = 0;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = 0;
  }

  public Post(String title, String href, Timestamp timestamp, int score) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = score;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
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

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void upVote() {
    score += 1;
  }

  public void downVote() {
    score -= 1;
  }
}
