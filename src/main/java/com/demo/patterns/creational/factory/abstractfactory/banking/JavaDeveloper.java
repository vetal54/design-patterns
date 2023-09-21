package com.demo.patterns.creational.factory.abstractfactory.banking;

import com.demo.patterns.creational.factory.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

  @Override
  public void writeCode() {
    System.out.println("Java developer writes java code...");
  }
}
