package com.demo.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Runnable task = () -> {
      Singleton singleton = Singleton.getInstance();
      singleton.addStringToList(Thread.currentThread().getName() + " added a string");

      List<String> strings = singleton.getStringList();
      System.out.println("Strings in the list: " + strings);
    };

    int numberOfThreads = 5;
    List<Thread> threads = new ArrayList<>();

    for (int i = 0; i < numberOfThreads; i++) {
      Thread thread = new Thread(task);
      threads.add(thread);
      thread.start();
    }

    for (Thread thread : threads) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
        Thread.currentThread().interrupt();
      }
    }
  }
}
