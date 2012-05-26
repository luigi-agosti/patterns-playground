package com.luigiagosti.learning.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Ask the command to carry out the request.
 * 
 * The invoker can keep the history.
 */
public class Invoker {
    
    private List<Command> history = new ArrayList<Command>();
    
    public Invoker() {
    }
  
    public void storeAndExecute(Command cmd) {
       this.history.add(cmd); 
       cmd.execute();        
    }
}
