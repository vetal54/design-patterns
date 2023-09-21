package com.demo.patterns.creational.factory.abstractfactory.website;

import com.demo.patterns.creational.factory.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {

  @Override
  public void manageProject() {
    System.out.println("Website PM manages web project...");
  }
}
