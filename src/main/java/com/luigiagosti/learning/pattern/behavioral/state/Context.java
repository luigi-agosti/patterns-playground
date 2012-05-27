package com.luigiagosti.learning.pattern.behavioral.state;

/**
 * Maintain a reference to the concrete state that 
 * define the current state.
 */
public class Context {
    
    private State state;
    
    public void request() {
        state.handle();
    }

}
