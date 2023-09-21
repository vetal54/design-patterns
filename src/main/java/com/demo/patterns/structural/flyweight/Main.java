package com.demo.patterns.structural.flyweight;

public class Main {

  public static void main(String[] args) {
    CarFactory carFactory = new CarFactory();

    Car car1 = carFactory.createCar("Sedan", "Blue");
    Car car2 = carFactory.createCar("SUV", "Red");
    Car car3 = carFactory.createCar("Sedan", "Blue");

    car1.drive();
    car2.drive();
    car3.drive();

    System.out.println("car1 == car2: " + (car1 == car2));
    System.out.println("car1 == car3: " + (car1 == car3));
  }
}
