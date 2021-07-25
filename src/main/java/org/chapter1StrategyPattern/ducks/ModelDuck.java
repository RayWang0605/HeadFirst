package org.chapter1StrategyPattern.ducks;

import org.chapter1StrategyPattern.impl.Fly0;
import org.chapter1StrategyPattern.impl.Quack0;
import org.chapter1StrategyPattern.model.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        behaviorFly = new Fly0();
        behaviorQuack = new Quack0();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
