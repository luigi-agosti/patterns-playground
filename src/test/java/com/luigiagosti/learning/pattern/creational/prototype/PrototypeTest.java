package com.luigiagosti.learning.pattern.creational.prototype;

import org.junit.Test;

public class PrototypeTest {
    
    @Test
    public void usage() {
        ConcretePrototype1 cp = new ConcretePrototype1();
        cp.cloneItself();
    }
}
