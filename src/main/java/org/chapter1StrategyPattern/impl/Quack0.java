package org.chapter1StrategyPattern.impl;

import org.chapter1StrategyPattern.model.BehaviorQuack;

public class Quack0 implements BehaviorQuack {
    @Override
    public void quack() {
        System.out.println("Can not quack");
    }
}
