package com.demo.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class TextEditorHistory {

  private List<Memento> mementos = new ArrayList<>();

  public void saveMemento(Memento memento) {
    mementos.add(memento);
  }

  public Memento getMemento(int index) {
    return mementos.get(index);
  }
}
