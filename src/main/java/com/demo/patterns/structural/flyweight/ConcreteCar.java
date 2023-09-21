package com.demo.patterns.structural.flyweight;

public class ConcreteCar implements Car {

  private String color;
  private String model;

  public ConcreteCar(String color, String model) {
    this.color = color;
    this.model = model;
  }

  @Override
  public void drive() {
    System.out.println("Driving " + color + " " + model);
  }
}
