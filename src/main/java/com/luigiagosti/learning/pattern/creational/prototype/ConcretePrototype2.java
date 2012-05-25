package com.luigiagosti.learning.pattern.creational.prototype;

public class ConcretePrototype2 implements Prototype {

    
    @Override
    public Prototype cloneItself() {
        ConcretePrototype2 cp = new ConcretePrototype2();
        // setting everything as it is
        return cp;
    }

}
