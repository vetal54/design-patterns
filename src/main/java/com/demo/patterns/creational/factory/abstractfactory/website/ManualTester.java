package com.demo.patterns.creational.factory.abstractfactory.website;

import com.demo.patterns.creational.factory.abstractfactory.Tester;

public class ManualTester implements Tester {


  @Override
  public void testCode() {
    System.out.println("Manual tester tests website...");
  }
}
