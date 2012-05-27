package com.luigiagosti.learning.pattern.behavioral.memento;

/**
 * Create the memento from the snapshot of the state.
 * Recover the state from a memento. 
 */
public class Originator {
    
    private String state;
    
    public Memento createMemento() {
        Memento m = new Memento();
        m.setState(state);
        return m;
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

}
