package com.luigiagosti.learning.pattern.behavioral.iterator;

public interface Iterator {
    
    Aggregate first();
    
    Aggregate next();
    
    boolean isDone();
    
    Aggregate currentItem();

}
