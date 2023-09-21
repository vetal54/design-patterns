package com.demo.patterns.creational.factory.factorymethod;

public class CppDeveloperFactory implements DeveloperFactory {

  @Override
  public Developer createDeveloper() {
    return new CppDeveloper();
  }
}
