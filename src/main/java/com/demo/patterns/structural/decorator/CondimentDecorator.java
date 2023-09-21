package com.demo.patterns.structural.decorator;

public abstract class CondimentDecorator extends Beverage {

  Beverage beverage;

  @Override
  public abstract String getDescription();
}
