package com.demo.patterns.creational.builder;

public class Main {

  public static void main(String[] args) {
    Director director = new Director();
    CarBuilder carBuilder = new FordBuilder();

    director.setCarBuilder(carBuilder);
    director.buildCar();

    Car car = carBuilder.getCar();
    System.out.println(car);
  }
}
