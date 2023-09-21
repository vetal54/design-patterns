package com.demo.patterns.behavioral.chainofresponsibility;

public class Main {

  public static void main(String[] args) {
    DispenseChain d50 = new Dollar50Dispenser();
    DispenseChain d20 = new Dollar20Dispenser();
    DispenseChain d5 = new Dollar5Dispenser();

    d50.setNextChain(d20);
    d20.setNextChain(d5);

    d50.dispense(new Currency(95));
  }
}
