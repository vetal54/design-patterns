package com.demo.patterns.creational.factory.abstractfactory;

import com.demo.patterns.creational.factory.abstractfactory.banking.BankingTeamFactory;
import com.demo.patterns.creational.factory.abstractfactory.website.WebsiteTeamFactory;

public class Main {

  public static void main(String[] args) {
    System.out.println("Creating banking team...");
    team(new BankingTeamFactory());

    System.out.println();

    System.out.println("Creating website team...");
    team(new WebsiteTeamFactory());
  }

  static void team(ProjectTeamFactory projectTeamFactory) {
    Developer developer = projectTeamFactory.creatDeveloper();
    Tester tester = projectTeamFactory.createTester();
    ProjectManager projectManager = projectTeamFactory.createProjectManager();

    developer.writeCode();
    tester.testCode();
    projectManager.manageProject();
  }
}
