package com.demo.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

  private static volatile Singleton INSTANCE;
  private final List<String> stringList;

  private Singleton() {
    stringList = new ArrayList<>();
  }

  public static Singleton getInstance() {
    if (INSTANCE == null) {
      synchronized (Singleton.class) {
        if (INSTANCE == null) {
          INSTANCE = new Singleton();
        }
      }
    }
    return INSTANCE;
  }

  public void addStringToList(String newString) {
    synchronized (stringList) {
      stringList.add(newString);
    }
  }

  public List<String> getStringList() {
    synchronized (stringList) {
      return new ArrayList<>(stringList);
    }
  }
}
