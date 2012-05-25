package com.luigiagosti.learning.pattern.structural.flyweight;

/**
 * Create and manage flyweights and ensure they are shared properly.
 */
public class FlyweightFactory {

    /*
     * there are different possible solution for the factory. 
     */
    public Flyweight getFlyweight(String key) {
        //TODO
        //if key exists
        //   return the already created flyweight
        //else 
        //   create a new one an added to the pool
        return new ConcreteFlyweight();
    }
}
