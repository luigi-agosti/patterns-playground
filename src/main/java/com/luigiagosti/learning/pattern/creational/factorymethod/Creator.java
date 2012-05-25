package com.luigiagosti.learning.pattern.creational.factorymethod;

/**
 * Declares the factory method.
 * 
 * May call the factory method to create the product.
 */
public abstract class Creator {
    
    private Product product;
    
    public void someIperation() {
        //...
        product = factoryMethod();
        //...
        product.something();
    }
    
    protected abstract Product factoryMethod();

}
