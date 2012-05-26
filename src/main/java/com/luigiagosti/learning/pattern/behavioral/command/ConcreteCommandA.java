package com.luigiagosti.learning.pattern.behavioral.command;

/**
 * Define the binding between a Receiver object and an action.
 * 
 * Implements execute by invoking the corresponding operations on Receiver
 */
public class ConcreteCommandA implements Command {
    
    private Receiver receiver;
    
    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operationA();
    }

}
