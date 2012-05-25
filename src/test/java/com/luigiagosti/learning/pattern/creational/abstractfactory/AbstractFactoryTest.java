package com.luigiagosti.learning.pattern.creational.abstractfactory;

import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryTest {

    private AbstractFactory factory1;
    private AbstractFactory factory2;
    
    @Before
    public void before() {
        factory1 = new ConcreteFactory1();
        factory2 = new ConcreteFactory2();
    }
    
    @Test
    public void testingTheUsability() {
        factory1.createProductA();
        factory1.createProductB();
        factory2.createProductA();
        factory2.createProductB();
    }

}
