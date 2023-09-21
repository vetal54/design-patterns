package com.demo.patterns.creational.factory.abstractfactory.banking;

import com.demo.patterns.creational.factory.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {

  @Override
  public void manageProject() {
    System.out.println("Banking PM manages banking project...");
  }
}
