package org.chapter1StrategyPattern.impl;

import org.chapter1StrategyPattern.model.BehaviorQuack;

public class Quack2 implements BehaviorQuack {
    @Override
    public void quack() {
        System.out.println("Quack 22222");
    }
}
