package com.luigiagosti.learning.pattern.structural.proxy;

/**
 * Maintains a reference that lets Proxy access the real object.
 * Provides an interface identical to the Subject.
 * Controls access to the Subject.
 * 
 * Provide a surrogate or placeholder for another object to control access to it.
 * 
 * One reason for controlling access to an object is to defer full cost of its 
 * creation and initialization.
 * 
 * An adapter is similar the difference is that the adapter doesn't 
 * provide the same interface. Often the ProtectionProxy can expose
 * only a subset of the interface of the subject.
 * 
 * Decorator is similar but add responsibilities while Proxy controls.
 */
public class Proxy implements Subject {

    private Subject subject;
    
    public Proxy() {
        this(new RealSubject());
    }
    
    public Proxy(Subject subject) {
        this.subject = subject;
    }
    
    public void request() {
        subject.request();
    }
    
}
