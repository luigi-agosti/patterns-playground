package com.luigiagosti.learning.pattern.creational.builder;

/**
 * Specifies an abstract interface for creating parts of a product object.
 * 
 * Builder is similar to abstract factory but focus on constructing 
 * a complex object step by step. On the contrary the AbstractFactory 
 * provides a family of product objects.
 * 
 * Builders are often used to build Composite.
 */
public interface Builder {
    
    Product getProduct();

    void buildPartB();
    
    void buildPartA();

}
