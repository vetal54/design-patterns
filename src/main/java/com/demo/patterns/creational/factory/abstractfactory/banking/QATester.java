package com.demo.patterns.creational.factory.abstractfactory.banking;

import com.demo.patterns.creational.factory.abstractfactory.Tester;

public class QATester implements Tester {


  @Override
  public void testCode() {
    System.out.println("QA tester tests banking code...");
  }
}
