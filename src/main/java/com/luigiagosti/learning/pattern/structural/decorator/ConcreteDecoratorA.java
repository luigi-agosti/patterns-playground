package com.luigiagosti.learning.pattern.structural.decorator;

/**
 * Add specific responsibility of A to the component.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        decorateWithSpecificLogicOfA();
    }

    private void decorateWithSpecificLogicOfA() {
        
    }

}
