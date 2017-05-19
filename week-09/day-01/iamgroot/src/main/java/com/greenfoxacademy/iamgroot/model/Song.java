package com.greenfoxacademy.iamgroot.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String author;
  String title;
  String genre;
  Date year;
  int rating;

  public Song() {
    this.rating = 0;
  }

  public Song(String author, String title, String genre, Date year, int rating) {
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.year = year;
    this.rating = rating;
  }

  public Song(String author, String title, String genre, Date year) {
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.year = year;
  }

  public void upVote() {
    rating += 1;
  }

  public void downVote() {
    rating -= 1;
  }
}
