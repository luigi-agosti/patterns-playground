package com.luigiagosti.learning.pattern.creational.factorymethod;

/**
 * Overrides the factoryMethod
 */
public class ConcreteCreator extends Creator {

    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
    
    

}
