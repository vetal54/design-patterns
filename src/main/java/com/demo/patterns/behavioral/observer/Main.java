package com.demo.patterns.behavioral.observer;

public class Main {

  public static void main(String[] args) {
    MetaStation observed = new MetaStation();
    observed.addObserver(new ConsoleObserver());
    observed.addObserver(new FileObserver("data.txt"));

    observed.setMeasurements(21, 224);
    observed.setMeasurements(-5, 450);
  }
}
