package com.luigiagosti.learning.pattern.behavioral.observer;

import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers;
    private String state;
    
    @Override
    public void attach(Observer observer) {
        if(observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
