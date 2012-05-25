package com.luigiagosti.learning.pattern.structural.decorator;

/**
 * Attach additional responsibilities to an object dynamically. 
 * 
 * Decorators provides a flexible alternative to subclassing for extending functionality.
 * 
 * Motivation : we want to add responsibilities to specific objects not the entire class.
 * 
 * Maintains a reference to a component object and define an interface 
 * that conforms to component's interface.
 * 
 * The decorator decorates the component.
 * 
 * Note this can be an interface and the responsibility to forward the call
 * to the component can be on the concrete component.
 */
public class Decorator implements Component {

    private Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
    
    @Override
    public void operation() {
        component.operation();
    }

}
