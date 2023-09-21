package com.demo.patterns.creational.factory.abstractfactory.website;

import com.demo.patterns.creational.factory.abstractfactory.Developer;

public class PhpDeveloper  implements Developer {

  @Override
  public void writeCode() {
    System.out.println("Php developer writes php code...");
  }
}

