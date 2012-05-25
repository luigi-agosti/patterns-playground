package com.luigiagosti.learning.pattern.structural.adapter;

/**
 * Adapt the interface of Adaptee to the Target interface.
 * 
 * Convert the interface of a class into another interface clients expect. 
 * 
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 
 * Also known as Wrapper.
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
