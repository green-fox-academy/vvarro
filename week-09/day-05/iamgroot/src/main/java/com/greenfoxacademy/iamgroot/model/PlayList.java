package com.greenfoxacademy.iamgroot.model;

import java.util.ArrayList;

public class PlayList {

  private Iterable<Song> playlist;

  public PlayList() {
    this.playlist = new ArrayList<>();
  }

  public Iterable<Song> getSong() {
    return playlist;
  }

  public void setSong(Iterable<Song> playlist) {
    this.playlist = playlist;
  }
}
