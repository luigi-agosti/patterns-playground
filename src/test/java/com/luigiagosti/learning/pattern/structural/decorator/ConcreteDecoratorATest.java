package com.luigiagosti.learning.pattern.structural.decorator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class ConcreteDecoratorATest {
    
    private Component component;
    private ConcreteDecoratorA decorator;
    
    @Before
    public void before() {
        component = mock(Component.class);
        decorator = new ConcreteDecoratorA(component);
    }
    
    @Test
    public void shouldBeEasyToTestConcreteDecorateAInIsolation() {
        decorator.operation();
        verify(component).operation();
    }

}
