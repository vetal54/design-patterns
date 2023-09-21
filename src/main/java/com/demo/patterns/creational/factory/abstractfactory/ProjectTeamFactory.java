package com.demo.patterns.creational.factory.abstractfactory;

public interface ProjectTeamFactory {

  Developer creatDeveloper();

  ProjectManager createProjectManager();

  Tester createTester();
}
