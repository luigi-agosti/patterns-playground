package com.luigiagosti.learning.pattern.structural.adapter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

/**
 * Looks like should be easy to test the adapter logic.
 */
public class AdapterTest {

    private Adaptee adaptee;
    
    @Before
    public void before() {
        adaptee = mock(Adaptee.class);
    }
    
    @Test
    public void theAdapterShouldCallAdapteeWhenTargetRequestIsCalled() {
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
        
        verify(adaptee).differentRequest();
    }
    
}
