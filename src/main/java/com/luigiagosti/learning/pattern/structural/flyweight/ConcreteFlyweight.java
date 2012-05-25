package com.luigiagosti.learning.pattern.structural.flyweight;

import com.luigiagosti.learning.pattern.structural.flyweight.util.ExtrinsicState;
import com.luigiagosti.learning.pattern.structural.flyweight.util.IntrinsicState;

/**
 * Any concrete flyweight has to have an intrinsic state
 * that is independent from any concrete flyweight object.
 */
public class ConcreteFlyweight implements Flyweight {

    private IntrinsicState state;
    
    @Override
    public void operation(ExtrinsicState state) {
        usingState();
    }

    private void usingState() {
        state.doSomething();
    }

}
