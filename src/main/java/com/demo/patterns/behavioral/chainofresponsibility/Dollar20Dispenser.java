package com.demo.patterns.behavioral.chainofresponsibility;

public class Dollar20Dispenser extends DispenseChain {

  @Override
  protected int getNoteValue() {
    return 20;
  }
}
