package com.demo.patterns.structural.bridge;

public class Rectangle extends Shape {

  public Rectangle(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("Drawing rectangle");
  }
}
