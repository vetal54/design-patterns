package com.demo.patterns.behavioral.memento;

public class Main {

  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor();
    TextEditorHistory history = new TextEditorHistory();

    textEditor.setText("Hello, World!");
    history.saveMemento(textEditor.saveToMemento());

    textEditor.setText("New content");
    history.saveMemento(textEditor.saveToMemento());

    textEditor.setText("Something new");
    history.saveMemento(textEditor.saveToMemento());

    textEditor.restoreFromMemento(history.getMemento(1));
    System.out.println(textEditor.getText());
  }
}
