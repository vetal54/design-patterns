package com.demo.patterns.creational.prototype;

public class Project implements Copyable<Project> {

  private int id;
  private String name;
  private String code;

  public Project(int id, String name, String code) {
    this.id = id;
    this.name = name;
    this.code = code;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public Project copyObject() {
    return new Project(id, name, code);
  }

  @Override
  public String toString() {
    return "Project{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", code='" + code + '\'' +
        '}';
  }
}
