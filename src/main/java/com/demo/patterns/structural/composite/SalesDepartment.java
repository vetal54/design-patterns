package com.demo.patterns.structural.composite;

public class SalesDepartment implements Department {

  private String name;

  public SalesDepartment(String name) {
    this.name = name;
  }

  @Override
  public void printDepartmentName() {
    System.out.println(name);
  }
}
