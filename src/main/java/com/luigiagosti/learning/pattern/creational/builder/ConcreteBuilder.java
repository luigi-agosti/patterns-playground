package com.luigiagosti.learning.pattern.creational.builder;

/**
 * Constructs and assemble parts by implementing the Builder 
 */
public class ConcreteBuilder implements Builder {

    private Product product;
    
    public ConcreteBuilder() {
        product = new Product();
    }
    
    @Override
    public void buildPartA() {
        product.setPropertyA();
    }
    
    @Override
    public void buildPartB() {
        product.setPropertyB();
    }

    @Override
    public Product getProduct() {
        return product;
    }

}
