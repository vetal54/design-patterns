package com.demo.patterns.behavioral.command.invoker;

import com.demo.patterns.behavioral.command.command.TextFileOperation;
import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

  private final List<TextFileOperation> textFileOperations = new ArrayList<>();

  public String executeOperation(TextFileOperation textFileOperation) {
    textFileOperations.add(textFileOperation);
    return textFileOperation.execute();
  }

  public List<TextFileOperation> getTextFileOperations() {
    return textFileOperations;
  }
}
