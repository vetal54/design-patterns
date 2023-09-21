package com.demo.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {

  private User admin;
  private List<User> userList = new ArrayList<>();

  public void setAdmin(User admin) {
    if (admin instanceof Admin) {
      this.admin = admin;
    } else {
      throw new RuntimeException("Not enough rights");
    }
  }

  public void addUser(User user) {
    if (admin == null) {
      throw new RuntimeException("There is no admin in the chat");
    }

    if (user instanceof SimpleUser) {
      userList.add(user);
    } else {
      throw new RuntimeException("Admin cannot join another chat");
    }
  }

  @Override

  public void sendMessage(String message, User user) {
    if (user instanceof Admin) {
      for (User u : userList) {
        u.getMessage(u.getName() + ": " + message);
      }
    }

    if (user instanceof SimpleUser) {
      for (User u : userList) {
        if (u != user && u.isEnable()) {
          u.getMessage(u.getName() + ": " + message);
        }
      }
      if (admin.isEnable()) {
        admin.getMessage(user.getName() + ": " + message);
      }
    }
  }
}
