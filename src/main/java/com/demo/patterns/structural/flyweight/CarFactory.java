package com.demo.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

  private Map<String, Car> carMap = new HashMap<>();

  public Car createCar(String color, String model) {
    String key = color + model;
    return carMap.computeIfAbsent(key, newCar ->
        new ConcreteCar(color, model));
  }
}
