package com.demo.patterns.behavioral.command.command;

import com.demo.patterns.behavioral.command.receiver.TextFile;

public class OpenTextFileOperation implements TextFileOperation {

  private final TextFile textFile;

  public OpenTextFileOperation(TextFile textFile) {
    this.textFile = textFile;
  }

  @Override
  public String execute() {
    return textFile.open();
  }
}
