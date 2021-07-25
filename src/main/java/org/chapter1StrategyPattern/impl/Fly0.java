package org.chapter1StrategyPattern.impl;

import org.chapter1StrategyPattern.model.BehaviorFly;

public class Fly0 implements BehaviorFly {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
