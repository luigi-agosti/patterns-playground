package com.luigiagosti.learning.pattern.structural.bridge;

/**
 * Decouple an abstraction from its implementation so that the two can vary independently.
 * 
 * Very useful to decouple the interface form the implementation.
 * 
 * In this way the hierarchy of the abstraction and the implementor can be extended independently.
 */
public abstract class Abstraction {
    
    private Implementor implementor;
    
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    public void operation() {
        implementor.operationImplementation();
    }

}
