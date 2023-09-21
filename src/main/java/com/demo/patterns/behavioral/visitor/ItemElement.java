package com.demo.patterns.behavioral.visitor;

public interface ItemElement {

  int accept(ShoppingCartVisitor visitor);
}
