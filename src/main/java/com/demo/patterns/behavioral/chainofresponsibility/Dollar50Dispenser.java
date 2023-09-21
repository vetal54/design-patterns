package com.demo.patterns.behavioral.chainofresponsibility;

public class Dollar50Dispenser extends DispenseChain {

  @Override
  public int getNoteValue() {
    return 50;
  }
}
