package com.demo.patterns.structural.bridge;

public abstract class Shape {

  protected Color color;

  Shape(Color color) {
    this.color = color;
  }

  public void showShape() {
    draw();
    color.fillColor();
  }

  abstract void draw();
}
