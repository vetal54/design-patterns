package com.demo.patterns.behavioral.mediator;

public class SimpleUser extends User {

  public SimpleUser(Chat chat, String name) {
    super(chat, name);
  }

  @Override
  public void getMessage(String message) {
    System.out.println("User: " + getName() + " receives the message: " + message);
  }
}
