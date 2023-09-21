package com.demo.patterns.behavioral.iterator;

public class Main {

  public static void main(String[] args) {
    String[] skills = {"Java", "Sql", "Spring", "Jpa"};
    JavaDeveloper javaDeveloper = new JavaDeveloper("Petro", skills);

    Iterator iterator = javaDeveloper.createIterator();
    System.out.println(javaDeveloper.getName());
    System.out.println("Skills:");

    while (iterator.hasNext()) {
      System.out.println("\t" + iterator.next());
    }
  }
}
