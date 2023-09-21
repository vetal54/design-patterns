package com.demo.patterns.behavioral.mediator;

public abstract class User {

  private final Chat chat;
  private final String name;
  private boolean isEnable = true;

  User(Chat chat, String name) {
    this.chat = chat;
    this.name = name;
  }

  public void sendMessage(String message) {
    chat.sendMessage(message, this);
  }

  public boolean isEnable() {
    return isEnable;
  }

  public void setEnable(boolean isEnable) {
    this.isEnable = isEnable;
  }

  public String getName() {
    return name;
  }

  public abstract void getMessage(String message);
}
