package com.luigiagosti.learning.pattern.behavioral.templatemethod;

/**
 * Defines abstract primitive operations.
 * 
 * Implements a template method defining the skeleton of an algorithm.
 * 
 * Template methods lead to an inverted control.
 * The Hollywood principle : don't call us, we'll call you.
 */
public abstract class AbstractClass {
    
    public void templateMethod() {
        //something
        primitiveOperation1();
        //something else
        primitiveOperation2();
        //more
        hookOperation();
    }

    protected void hookOperation() {
        // Hooked because provides a default empty implementation
    }

    protected abstract void primitiveOperation2();

    protected abstract void primitiveOperation1();
    

}
