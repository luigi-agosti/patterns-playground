package com.luigiagosti.learning.pattern.structural.decorator;

/**
 * Maintains a reference to a component object and define an interface 
 * that conforms to component's interface.
 * <br>
 * The decorator decorates the component.
 * <br>
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
