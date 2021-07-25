package org.chapter1StrategyPattern;

import org.chapter1StrategyPattern.ducks.MallardDuck;
import org.chapter1StrategyPattern.ducks.ModelDuck;
import org.chapter1StrategyPattern.impl.Fly1;
import org.chapter1StrategyPattern.model.Duck;

public class App 
{
    public static void main( String[] args )
    {
        Duck mallardDuck1 = new MallardDuck();
        mallardDuck1.display();
        mallardDuck1.fly();
        mallardDuck1.quack();

        System.out.println("===================================");

        Duck modelDuck1 = new ModelDuck();
        modelDuck1.setBehaviorFly(new Fly1());
        modelDuck1.display();
        modelDuck1.fly();
        modelDuck1.quack();
    }
}
