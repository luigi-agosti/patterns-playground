package com.luigiagosti.learning.pattern.behavioral.command;

/**
 * Encapsulate a request as an object, thereby letting you 
 * parameterize clients with different request, queue or log
 * requests, and support undoable operations.
 * 
 * Declare an interface for executing an operation.
 */
public interface Command {

    void execute();
    
}
