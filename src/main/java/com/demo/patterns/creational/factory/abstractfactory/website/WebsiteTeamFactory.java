package com.demo.patterns.creational.factory.abstractfactory.website;

import com.demo.patterns.creational.factory.abstractfactory.Developer;
import com.demo.patterns.creational.factory.abstractfactory.ProjectManager;
import com.demo.patterns.creational.factory.abstractfactory.ProjectTeamFactory;
import com.demo.patterns.creational.factory.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

  @Override
  public Developer creatDeveloper() {
    return new PhpDeveloper();
  }

  @Override
  public ProjectManager createProjectManager() {
    return new WebsitePM();
  }

  @Override
  public Tester createTester() {
    return new ManualTester();
  }
}
