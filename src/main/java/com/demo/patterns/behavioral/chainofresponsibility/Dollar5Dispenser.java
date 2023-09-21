package com.demo.patterns.behavioral.chainofresponsibility;

public class Dollar5Dispenser extends DispenseChain {

  @Override
  protected int getNoteValue() {
    return 5;
  }
}
