package com.demo.patterns.creational.factory.abstractfactory.banking;

import com.demo.patterns.creational.factory.abstractfactory.Developer;
import com.demo.patterns.creational.factory.abstractfactory.ProjectManager;
import com.demo.patterns.creational.factory.abstractfactory.ProjectTeamFactory;
import com.demo.patterns.creational.factory.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

  @Override
  public Developer creatDeveloper() {
    return new JavaDeveloper();
  }

  @Override
  public ProjectManager createProjectManager() {
    return new BankingPM();
  }

  @Override
  public Tester createTester() {
    return new QATester();
  }
}
