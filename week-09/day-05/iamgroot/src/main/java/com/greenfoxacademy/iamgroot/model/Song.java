package com.greenfoxacademy.iamgroot.model;

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
  String year;
  int rating;

  public Song() {
    this.rating = 0;
  }

  public Song(String author, String title, String genre, String year, int rating) {
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.year = year;
    this.rating = rating;
  }

  public Song(String author, String title, String genre, String year) {
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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}
