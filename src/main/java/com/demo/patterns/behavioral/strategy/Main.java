package com.demo.patterns.behavioral.strategy;

public class Main {

  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.setActivity(new Coding());
    developer.executeActivity();

    developer.setActivity(new Training());
    developer.executeActivity();

    developer.setActivity(new Sleeping());
    developer.executeActivity();

    developer.setActivity(new Reading());
    developer.executeActivity();
  }
}
