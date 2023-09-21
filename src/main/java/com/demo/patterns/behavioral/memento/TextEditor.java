package com.demo.patterns.behavioral.memento;

// Originator
public class TextEditor {

  private String text;

  public void setText(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public Memento saveToMemento() {
    return new Memento(text);
  }

  public void restoreFromMemento(Memento memento) {
    text = memento.getState();
  }
}
