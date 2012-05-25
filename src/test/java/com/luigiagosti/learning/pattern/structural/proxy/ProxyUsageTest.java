package com.luigiagosti.learning.pattern.structural.proxy;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * It is not always worth it to test the proxy itself.
 * If there is logic is not that easy unless the dependency 
 * with the subject is exposed with the constructor or a setter.
 * 
 * It is difficult to test the construction of the Subject
 * if it is dependent on other objects.
 */
public class ProxyUsageTest {
    
    @Test
    public void howToUseProxy() {
        Proxy p = new Proxy();
        p.request();
    }
    
    @Test
    public void isNotEasyToMockTheSubjectUnlessTheDependencyIsMadeClear(){
        Subject subject = Mockito.mock(Subject.class);
        Proxy p = new Proxy(subject);
        p.request();
        Mockito.verify(subject).request();
    }
    
}
