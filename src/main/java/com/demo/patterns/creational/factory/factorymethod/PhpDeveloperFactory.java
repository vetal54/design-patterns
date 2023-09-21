package com.demo.patterns.creational.factory.factorymethod;

public class PhpDeveloperFactory implements DeveloperFactory {

  @Override
  public Developer createDeveloper() {
    return new PhpDeveloper();
  }
}
