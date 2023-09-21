package com.demo.patterns.structural.decorator;

public abstract class Beverage {

  protected String description = "Unknown beverage!";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
