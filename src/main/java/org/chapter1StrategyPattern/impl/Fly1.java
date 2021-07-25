package org.chapter1StrategyPattern.impl;

import org.chapter1StrategyPattern.model.BehaviorFly;

public class Fly1 implements BehaviorFly {
    @Override
    public void fly() {
        System.out.println("fly 11111");
    }
}
