package com.luigiagosti.learning.pattern.creational.prototype;

public class ConcretePrototype1 implements Prototype {
    
    @Override
    public Prototype cloneItself() {
        ConcretePrototype1 cp = new ConcretePrototype1();
        // setting everything as it is
        return cp;
    }

}
