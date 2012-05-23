package com.luigiagosti.learning.pattern.structural.decorator;

/**
 * Add specific responsibility of B to the component.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        decorateWithSpecificLogicOfB();
    }

    private void decorateWithSpecificLogicOfB() {
        
    }

    
}
