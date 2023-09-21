package com.demo.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MetaStation implements Observed {

  private int temperature;
  private int pressure;
  private final List<Observer> observerList = new ArrayList<>();

  public void setMeasurements(int temperature, int pressure) {
    this.temperature = temperature;
    this.pressure = pressure;
    notifyObservers();
  }

  @Override
  public void addObserver(Observer o) {
    observerList.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observerList) {
      o.handleEvent(temperature, pressure);
    }
  }
}
