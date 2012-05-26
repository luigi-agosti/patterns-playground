package com.luigiagosti.learning.pattern.behavioral.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;

public class HandlerTest {
    
    private ConcreteHandler1 handler1;
    private ConcreteHandler2 handler2;
    
    @Before
    public void before() {
        handler1 = new ConcreteHandler1();
        handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
    }
    
    @Test
    public void usage() {
        handler1.handleRequest();
    }

}
