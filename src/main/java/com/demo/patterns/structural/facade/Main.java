package com.demo.patterns.structural.facade;

public class Main {

  public static void main(String[] args) {
    CarFacade carFacade = new CarFacade();
    carFacade.startEngine();
    carFacade.stopEngine();
  }
}
