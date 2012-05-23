package com.luigiagosti.learning.pattern.structural.decorator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
    
    private Component component;
    
    @Before
    public void before() {
        this.component = mock(Component.class); 
    }
    
    @Test
    public void theDecoratorShouldForwardTheRequestOfAnOperationToComponent() {
        Decorator decorator = new Decorator(component);
        decorator.operation();
        
        verify(component).operation();
    }
    
    @Test
    public void shouldBePossibleToDecorateWithPreOperations() {
        Decorator decorator = new Decorator(component);
        decorator.operation();
        
        verify(component).operation();
    }
    

}
