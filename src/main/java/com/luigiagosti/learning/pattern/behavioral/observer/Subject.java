package com.luigiagosti.learning.pattern.behavioral.observer;

/**
 * Knows its observers. 
 * 
 * Provides an interface for attaching and detaching observers.
 */
public interface Subject {
    
    void attach(Observer observer);
    
    void detach(Observer observer);
    
    void notifyObservers();

}
