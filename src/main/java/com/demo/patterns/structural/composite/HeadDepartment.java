package com.demo.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

  private String name;

  private List<Department> childDepartments;

  public HeadDepartment(String name) {
    this.name = name;
    this.childDepartments = new ArrayList<>();
  }

  public void addDepartment(Department department) {
    childDepartments.add(department);
  }

  public void removeDepartment(Department department) {
    childDepartments.remove(department);
  }

  @Override
  public void printDepartmentName() {
    childDepartments.forEach(Department::printDepartmentName);
  }
}
