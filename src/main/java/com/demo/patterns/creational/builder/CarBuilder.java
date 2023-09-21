package com.demo.patterns.creational.builder;

public abstract class CarBuilder {

  protected Car car;

  void createCar() {
    car = new Car();
  }

  abstract void buildBrand();

  abstract void buildTransmission();

  abstract void buildModel();

  abstract void buildMaxSpeed();

  public Car getCar() {
    return car;
  }
}
