package com.luigiagosti.learning.pattern.behavioral.command;

import org.junit.Before;
import org.junit.Test;

public class CommandTest {
    
    private Receiver receiver;
    private ConcreteCommandA commandA;
    private ConcreteCommandB commandB;
    private Invoker invoker;
    
    @Before
    public void before() {
        this.receiver = new Receiver();
        this.commandA = new ConcreteCommandA(receiver);
        this.commandB = new ConcreteCommandB(receiver);
        this.invoker = new Invoker();
    }
    
    @Test
    public void usage() {
        invoker.storeAndExecute(commandA);
        invoker.storeAndExecute(commandB);
    }

}
