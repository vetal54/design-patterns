package com.demo.patterns.creational.builder;

public class Car {

  private String brand;
  private Transmission transmission;
  private String model;
  private int maxSpeed;

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", transmission=" + transmission +
        ", model='" + model + '\'' +
        ", maxSpeed=" + maxSpeed +
        '}';
  }
}
