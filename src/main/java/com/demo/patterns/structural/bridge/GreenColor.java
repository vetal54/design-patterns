package com.demo.patterns.structural.bridge;

public class GreenColor implements Color {


  @Override
  public void fillColor() {
    System.out.println("Filling in green color");
  }
}
