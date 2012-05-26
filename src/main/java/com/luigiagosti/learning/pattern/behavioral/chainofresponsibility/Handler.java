package com.luigiagosti.learning.pattern.behavioral.chainofresponsibility;

/**
 * Defines an interface for handling requests.
 * 
 * Implements the successor link.
 */
public abstract class Handler {

    private Handler successor; 
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public void handleRequest() {
        if(successor == null) {
            onRequestRecieved();
        }
        if(successor != null) {
            successor.onRequestRecieved();
        }
    }
    
    protected abstract void onRequestRecieved();
}
