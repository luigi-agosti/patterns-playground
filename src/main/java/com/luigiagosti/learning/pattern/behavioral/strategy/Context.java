package com.luigiagosti.learning.pattern.behavioral.strategy;

public class Context {
    
    private Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
 
    public void executeStrategy() {
        strategy.executeAlgorithm();
    }
}
