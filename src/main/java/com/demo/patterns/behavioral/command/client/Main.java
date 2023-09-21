package com.demo.patterns.behavioral.command.client;

import com.demo.patterns.behavioral.command.command.OpenTextFileOperation;
import com.demo.patterns.behavioral.command.command.ReadTextFileOperation;
import com.demo.patterns.behavioral.command.command.TextFileOperation;
import com.demo.patterns.behavioral.command.command.WriteTextFileOperation;
import com.demo.patterns.behavioral.command.invoker.TextFileOperationExecutor;
import com.demo.patterns.behavioral.command.receiver.TextFile;

public class Main {

  public static void main(String[] args) {
    TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
    TextFileOperation readTextFileOperation = new ReadTextFileOperation(new TextFile("file2.txt"));
    TextFileOperation writeTextFileOperation = new WriteTextFileOperation(
        new TextFile("file2.txt"));
    TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
    System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
    System.out.println(textFileOperationExecutor.executeOperation(readTextFileOperation));
    System.out.println(textFileOperationExecutor.executeOperation(writeTextFileOperation));

    System.out.println(
        "The number of commands in the list " + textFileOperationExecutor.getTextFileOperations()
            .size());
  }
}
