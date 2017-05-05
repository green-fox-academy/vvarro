package com.greenfoxacademy.programmerfoxclub.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TrickList {
    List<Trick> trickList = new ArrayList<>();

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
