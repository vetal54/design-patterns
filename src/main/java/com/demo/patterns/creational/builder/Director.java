package com.demo.patterns.creational.builder;

public class Director {

  private CarBuilder carBuilder;

  public void buildCar() {
    carBuilder.createCar();
    carBuilder.buildBrand();
    carBuilder.buildTransmission();
    carBuilder.buildModel();
    carBuilder.buildMaxSpeed();
  }

  public void setCarBuilder(CarBuilder carBuilder) {
    this.carBuilder = carBuilder;
  }
}
