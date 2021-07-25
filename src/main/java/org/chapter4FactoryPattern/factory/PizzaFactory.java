package org.chapter4FactoryPattern.factory;

import org.chapter4FactoryPattern.Pizzas.CheesePizza;
import org.chapter4FactoryPattern.Pizzas.ClamPizza;
import org.chapter4FactoryPattern.Pizzas.GreekPizza;
import org.chapter4FactoryPattern.Pizzas.VeggiePizza;
import org.chapter4FactoryPattern.model.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("CheesePizza")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("ClamPizza")){
            pizza = new ClamPizza();
        }
        else if (type.equals("GreekPizza")) {
            pizza = new GreekPizza();
        }
        else if (type.equals("VeggiePizza")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
