package com.luigiagosti.learning.pattern.behavioral.visitor;

/**
 * Define and accept operation that take visitor as an argument.
 */
public interface Element {
    
    void accept(Visitor visitor);

}
