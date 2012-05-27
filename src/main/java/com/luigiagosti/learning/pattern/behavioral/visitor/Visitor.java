package com.luigiagosti.learning.pattern.behavioral.visitor;

/**
 * Visitor lets you define a new operation without changing the 
 * classes of the elements of which it operates.
 */
public interface Visitor {

    void visit(ConcreteElementA element);
    
    void visit(ConcreteElementB element);
}
