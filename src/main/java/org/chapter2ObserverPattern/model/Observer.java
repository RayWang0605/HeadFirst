package org.chapter2ObserverPattern.model;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
