package com.demo.patterns.structural.composite;

public class FinancialDepartment implements Department {

  private String name;

  public FinancialDepartment(String name) {
    this.name = name;
  }

  @Override
  public void printDepartmentName() {
    System.out.println(name);
  }
}
