package org.chapter1StrategyPattern.ducks;

import org.chapter1StrategyPattern.impl.Fly1;
import org.chapter1StrategyPattern.impl.Quack1;
import org.chapter1StrategyPattern.model.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        behaviorFly = new Fly1();
        behaviorQuack = new Quack1();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
