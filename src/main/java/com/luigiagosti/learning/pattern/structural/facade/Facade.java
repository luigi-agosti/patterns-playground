package com.luigiagosti.learning.pattern.structural.facade;

/**
 * Overall result is that the facade is simple but the structure
 * under it is complicated.
 * 
 * Motivation : put a simple interface to hide all the complexity behind.
 * 
 * Provide a unified interface to a set of interfaces in a subsystem. 
 * 
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 */
public class Facade {
    
    public void operationA() {
        //Demand the operation to complicated objects
    }
    
    public void operationB() {
        //Demand the operation to complicated objects
    }

}
