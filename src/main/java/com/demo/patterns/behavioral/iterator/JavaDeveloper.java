package com.demo.patterns.behavioral.iterator;

public class JavaDeveloper implements Collection {

  private String name;
  private String[] skills;

  public JavaDeveloper(String name, String[] skills) {
    this.name = name;
    this.skills = skills;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getSkills() {
    return skills;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }

  @Override
  public Iterator createIterator() {
    return new SkillIterator();
  }

  private class SkillIterator implements Iterator {

    int position;

    @Override
    public boolean hasNext() {
      return skills.length > position;
    }

    @Override
    public Object next() {
      return skills[position++];
    }
  }
}
