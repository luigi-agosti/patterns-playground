package com.luigiagosti.learning.pattern.behavioral.memento;

/**
 * Without violating encapsulation, capture and externalize 
 * an object's internal state so that the object can be restore
 * to this state later.
 * 
 * A memento is an object that stores a snapshot of the
 * internal state of another object.
 */
public class Memento {
    
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
