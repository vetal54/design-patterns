package com.demo.patterns.creational.prototype;

public class Main {

  public static void main(String[] args) {
    Project project = new Project(1, "Project", "{ some code}");
    ProjectFactory factory = new ProjectFactory(project);

    Project copyProject = factory.copyProject();

    System.out.println(project);
    System.out.println(copyProject);

    copyProject.setName("new Project name");

    System.out.println(project);
    System.out.println(copyProject);
  }
}
