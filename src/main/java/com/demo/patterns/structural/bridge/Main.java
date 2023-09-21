package com.demo.patterns.structural.bridge;

public class Main {

  public static void main(String[] args) {
    Shape triangle = new Triangle(new BlackColor());
    triangle.showShape();
  }
}
