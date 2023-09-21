package com.demo.patterns.structural.bridge;

public class BlueColor implements Color {

  @Override
  public void fillColor() {
    System.out.println("Filling in blue color");
  }
}
