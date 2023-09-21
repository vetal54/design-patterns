package com.demo.patterns.behavioral.command.command;

import com.demo.patterns.behavioral.command.receiver.TextFile;

public class ReadTextFileOperation implements TextFileOperation {

  private final TextFile textFile;

  public ReadTextFileOperation(TextFile textFile) {
    this.textFile = textFile;
  }

  @Override
  public String execute() {
    return textFile.read();
  }
}
