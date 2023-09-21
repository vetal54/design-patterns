package com.demo.patterns.creational.prototype;

public class ProjectFactory {

  private Project project;

  public ProjectFactory(Project project) {
    this.project = project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Project copyProject() {
    return project.copyObject();
  }
}
