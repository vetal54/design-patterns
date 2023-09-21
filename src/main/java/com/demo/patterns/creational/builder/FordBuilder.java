package com.demo.patterns.creational.builder;

public class FordBuilder extends CarBuilder {

  @Override
  void buildBrand() {
    car.setBrand("Ford");
  }

  @Override
  void buildTransmission() {
    car.setTransmission(Transmission.MANUAL);
  }

  @Override
  void buildModel() {
    car.setModel("Focus");
  }

  @Override
  void buildMaxSpeed() {
    car.setMaxSpeed(220);
  }
}
