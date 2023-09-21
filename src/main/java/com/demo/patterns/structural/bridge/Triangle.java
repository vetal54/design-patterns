package com.demo.patterns.structural.bridge;

public class Triangle extends Shape {

  public Triangle(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("Drawing triangle");
  }
}
