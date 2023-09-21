package com.demo.patterns.behavioral.mediator;

public class Main {

  public static void main(String[] args) {
    TextChat chat = new TextChat();

    User admin = new Admin(chat, "Stepan");
    User u1 = new SimpleUser(chat, "Vlad");
    User u2 = new SimpleUser(chat, "Petro");
    User u3 = new SimpleUser(chat, "Den");
    u2.setEnable(false);

    chat.setAdmin(admin);
    chat.addUser(u1);
    chat.addUser(u2);
    chat.addUser(u3);

    u1.sendMessage("Hello friends!");
  }
}
