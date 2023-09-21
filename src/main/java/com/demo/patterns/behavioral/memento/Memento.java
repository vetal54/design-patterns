package com.demo.patterns.behavioral.memento;

// Memento
public class Memento {

  private final String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
