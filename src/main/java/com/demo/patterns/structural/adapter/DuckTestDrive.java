package com.demo.patterns.structural.adapter;

public class DuckTestDrive {

  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();
    WildTurkey wildTurkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

    System.out.println("The Turkey says...");
    wildTurkey.gobble();
    wildTurkey.fly();

    System.out.println("\nThe Duck says...");
    testDuck(mallardDuck);
    System.out.println("\nThe TurkeyAdapter says...");
    testDuck(turkeyAdapter);
  }
  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
