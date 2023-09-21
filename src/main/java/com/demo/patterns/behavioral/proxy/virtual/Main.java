package com.demo.patterns.behavioral.proxy.virtual;

public class Main {

  public static void main(String[] args) {
    Image image = new ProxyImage("D:/images/my.png");
    image.display();
  }
}
