package org.chapter1StrategyPattern.impl;

import org.chapter1StrategyPattern.model.BehaviorQuack;
import org.chapter1StrategyPattern.model.Duck;

public class Quack1 implements BehaviorQuack {
    @Override
    public void quack() {
        System.out.println("Quack 11111");
    }

    public static class MallardDuck extends Duck {
        public MallardDuck() {
            behaviorFly = new Fly1();
            behaviorQuack = new Quack1();
        }
        @Override
        public void display() {
            System.out.println("I'm a mallard duck");
        }
    }
}
