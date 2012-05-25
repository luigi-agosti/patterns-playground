package com.luigiagosti.learning.pattern.creational.abstractfactory;

/**
 * Declares an interface for operations that create 
 * abstract product objects.
 */
public interface AbstractFactory {

    AbstractProductA createProductA();
    
    AbstractProductB createProductB();
    
}
