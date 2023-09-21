package com.demo.patterns.behavioral.observer;

public class ConsoleObserver implements Observer {

  @Override
  public void handleEvent(int temp, int pressure) {
    System.out.println("Weather data updated, temperature - " + temp + ", pressure - " + pressure);
  }
}
