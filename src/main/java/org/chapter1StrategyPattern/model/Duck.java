package org.chapter1StrategyPattern.model;

public abstract class Duck {
    public BehaviorFly behaviorFly;
    public BehaviorQuack behaviorQuack;

    public Duck() {}
    public abstract void display();
    public void fly() {
        behaviorFly.fly();
    }
    public void quack() {
        behaviorQuack.quack();
    }

    public void setBehaviorFly(BehaviorFly behaviorFly) {
        this.behaviorFly = behaviorFly;
    }

    public void setBehaviorQuack(BehaviorQuack behaviorQuack) {
        this.behaviorQuack = behaviorQuack;
    }
}
