package com.luigiagosti.learning.pattern.structural.adapter;

/**
 * Adapt the interface of Adaptee to the Target interface.
 */     
public class Adapter implements Target {
    
    private Adaptee adaptee;
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.differentRequest();
    }
    

}
