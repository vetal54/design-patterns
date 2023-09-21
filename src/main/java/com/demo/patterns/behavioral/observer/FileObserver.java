package com.demo.patterns.behavioral.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {

  private final String path;

  public FileObserver(String path) {
    this.path = path;
  }

  private void writeDataToFile(String data) throws IOException {
    File file = new File(path);
    if (!file.exists()) {
      file.createNewFile();
    }

    try (PrintWriter fileWriter = new PrintWriter(new FileWriter(file, true))) {
      fileWriter.println(data);
    }
  }

  @Override
  public void handleEvent(int temp, int pressure) {
    String str = "Weather data updated, temperature: " + temp + ", pressure: " + pressure;
    try {
      writeDataToFile(str);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

