package com.demo.patterns.behavioral.chainofresponsibility;

public abstract class DispenseChain {

  protected DispenseChain nextChain;

  protected abstract int getNoteValue();

  public void dispense(Currency cur) {
    int noteValue = getNoteValue();
    int num = cur.getAmount() / noteValue;
    int remainder = cur.getAmount() % noteValue;
    if (cur.getAmount() >= noteValue) {
      System.out.println("Dispensing " + num + " " + noteValue + "$ note");
    }
    if (remainder != 0 && nextChain != null) {
      nextChain.dispense(new Currency(remainder));
    }
  }

  public void setNextChain(DispenseChain nextChain) {
    this.nextChain = nextChain;
  }
}
