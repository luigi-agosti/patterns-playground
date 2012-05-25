package com.luigiagosti.learning.pattern.structural.flyweight;

import com.luigiagosti.learning.pattern.structural.flyweight.util.ExtrinsicState;

/**
 * Use sharing to support large numbers of fine-grained objects efficiently. 
 * 
 * A flyweight is a shared object that can be used in multiple contexts simultaneously.
 * 
 * Intrinsic state : store in the flyweight this info is independent from the context.
 * 
 * Extrinsic state : depends on and varies with the flyweight's context.
 */
public interface Flyweight {

    void operation(ExtrinsicState state); 
}
