package com.demo.patterns.creational.factory.factorymethod;

public class JavaDeveloperFactory implements DeveloperFactory {

  @Override
  public Developer createDeveloper() {
    return new JavaDeveloper();
  }
}
