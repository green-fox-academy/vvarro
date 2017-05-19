package com.greenfoxacademy.iamgroot.model;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class PlayList {

  public Iterable<Song> playlist;

  public PlayList() {
    this.playlist = new ArrayList<>();
  }

  public Iterable<Song> getPlaylist() {
    return playlist;
  }

  public void setPlaylist(Iterable<Song> playlist) {
    this.playlist = playlist;
  }
}
