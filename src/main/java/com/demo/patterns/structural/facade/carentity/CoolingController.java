package com.demo.patterns.structural.facade.carentity;

public class CoolingController {

  private static final Integer DEFAULT_RADIATOR_SPEED = 10;

  private Integer temperatureUpperLimit;
  private Radiator radiator = new Radiator();
  private TemperatureSensor temperatureSensor = new TemperatureSensor();

  public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
    System.out.println("Setting temperature upper limit to " + temperatureUpperLimit);
    this.temperatureUpperLimit = temperatureUpperLimit;
  }

  public void run() {
    System.out.println("Cooling Controller ready!");
    radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
  }

  public void cool(Integer maxAllowedTemp) {
    System.out.println("Scheduled cooling with maximum allowed temperature " + maxAllowedTemp);
    temperatureSensor.getTemperature();
    radiator.on();
  }

  public void stop() {
    System.out.println("Stopping Cooling Controller..");
    radiator.off();
  }
}
