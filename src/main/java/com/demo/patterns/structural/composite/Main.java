package com.demo.patterns.structural.composite;

public class Main {

  public static void main(String[] args) {
    Department salesDepartment = new SalesDepartment("Sales department");
    Department financialDepartment = new FinancialDepartment("Financial department");
    HeadDepartment headDepartment = new HeadDepartment("Head department");

    headDepartment.addDepartment(salesDepartment);
    headDepartment.addDepartment(financialDepartment);

    Department secondSalesDepartment = new SalesDepartment("Second Sales department");
    HeadDepartment secondHeadDepartment = new HeadDepartment("Second Head department");

    secondHeadDepartment.addDepartment(secondSalesDepartment);
    headDepartment.addDepartment(secondHeadDepartment);

    headDepartment.printDepartmentName();
  }
}
