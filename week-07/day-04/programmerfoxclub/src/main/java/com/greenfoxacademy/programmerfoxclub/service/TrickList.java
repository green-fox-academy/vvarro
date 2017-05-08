package com.greenfoxacademy.programmerfoxclub.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TrickList {
  List<Trick> trickList;

    public TrickList(){
      List<Trick> trickList = new ArrayList<>();
      trickList.add(new Trick("Make coffee"));
      trickList.add(new Trick("Play a piano"));
      trickList.add(new Trick("Have a nap"));
    }

    public List<Trick> getAll() {
      return trickList;
    }

    public void add(Trick trick) {
      trickList.add(trick);
    }

    public void delete(int id) {
      Trick selected = null;
      for (Trick trick : trickList) {
        if (trick.id == id) {
          selected = trick;
        }
      }
      trickList.remove(selected);
    }

}
