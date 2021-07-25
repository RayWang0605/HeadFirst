package org.chapter1StrategyPattern.impl;


import org.chapter1StrategyPattern.model.BehaviorFly;

public class Fly2 implements BehaviorFly {
    @Override
    public void fly() {
        System.out.println("Fly 22222");
    }
}
