package com.demo.patterns.structural.decorator;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .15 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
