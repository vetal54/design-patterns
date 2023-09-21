package com.demo.patterns.creational.factory.factorymethod;

public class Main {

  public static void main(String[] args) {
    DeveloperFactory developerFactory = createDeveloperBySpeciality("Php");
    Developer developer = developerFactory.createDeveloper();
    developer.writeCode();
  }

  static DeveloperFactory createDeveloperBySpeciality(String speciality) {
    if (speciality.equalsIgnoreCase("java")) {
      return new JavaDeveloperFactory();
    } else if (speciality.equalsIgnoreCase("php")) {
      return new PhpDeveloperFactory();
    } else if (speciality.equalsIgnoreCase("C++")) {
      return new CppDeveloperFactory();
    } else {
      throw new RuntimeException(speciality + " is unknown speciality...");
    }
  }
}
