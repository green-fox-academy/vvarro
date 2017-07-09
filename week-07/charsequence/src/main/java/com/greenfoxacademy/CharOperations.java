package com.greenfoxacademy;

public class CharOperations implements CharSequence {
  String text;

  public CharOperations(String text) {
    this.text = text;
  }

  @Override
  public int length() {
    return text.length();
  }

  @Override
  public char charAt(int index) {
    String temp = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      temp = temp + text.charAt(i);
    }
    return temp.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String temp = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      temp = temp + text.charAt(i);
    }
    return temp.substring(start, end);
  }

  @Override
  public String toString() {
    String temp = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      temp = temp + text.charAt(i);
    }
    return temp.toString();
  }
}
