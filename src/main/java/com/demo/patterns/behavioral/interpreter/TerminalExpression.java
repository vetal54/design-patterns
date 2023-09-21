package com.demo.patterns.behavioral.interpreter;

public class TerminalExpression implements Expression {

  private String data;

  public TerminalExpression(String data) {
    this.data = data;
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(data);
  }
}
