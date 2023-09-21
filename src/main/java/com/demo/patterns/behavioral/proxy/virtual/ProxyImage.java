package com.demo.patterns.behavioral.proxy.virtual;

public class ProxyImage implements Image {

  private String url;
  private RealImage realImage;

  public ProxyImage(String url) {
    this.url = url;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(url);
    }
    realImage.display();
  }
}
