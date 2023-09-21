package com.demo.patterns.behavioral.proxy.virtual;

public class RealImage implements Image {

  private String url;

  public RealImage(String url) {
    this.url = url;
    load();
  }

  public void load() {
    System.out.println("Loading file by url " + url);
  }

  @Override
  public void display() {
    System.out.println("Displaying file by url " + url);
  }
}
