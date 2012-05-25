package com.luigiagosti.learning.pattern.creational.builder;

/**
 * Constructs the object using the builder.
 */
public class Director {
    
    private Builder builder; 
    
    public Product getProduct() {
        return builder.getProduct();
    }
    
    public void constructProduct() {
        builder.buildPartA();
        builder.buildPartB();
        //more settings
    }

}
