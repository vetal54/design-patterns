package com.demo.patterns.behavioral.chainofresponsibility;

public class Currency {

  private int amount;

  public Currency(int amt) {
    setAmount(amt);
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    if (amount > 0 && amount % 5 == 0) {
      this.amount = amount;
    } else {
      throw new RuntimeException("Amount should be in multiple of 5s.");
    }
  }
}
