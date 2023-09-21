package com.demo.patterns.creational.builder;

public class MercedesBuilder extends CarBuilder {

  @Override
  void buildBrand() {
    car.setBrand("Mercedes");
  }

  @Override
  void buildTransmission() {
    car.setTransmission(Transmission.AUTO);
  }

  @Override
  void buildModel() {
    car.setModel("S-class");
  }

  @Override
  void buildMaxSpeed() {
    car.setMaxSpeed(280);
  }
}
