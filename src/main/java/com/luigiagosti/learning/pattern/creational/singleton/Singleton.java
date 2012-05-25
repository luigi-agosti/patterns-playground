package com.luigiagosti.learning.pattern.creational.singleton;

/**
 * Ensure a class only has one instance, 
 * and provide a global point of access to it.
 */
public class Singleton {
    
    private static final Singleton instance = new Singleton();
    
    // Private constructor prevents instantiation from other classes
    private Singleton() { }

    public static Singleton getInstance() {
            return instance;
    }
    
}
