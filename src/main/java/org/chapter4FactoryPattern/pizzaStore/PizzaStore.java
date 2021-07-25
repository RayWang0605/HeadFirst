package org.chapter4FactoryPattern.pizzaStore;

import org.chapter4FactoryPattern.factory.PizzaFactory;
import org.chapter4FactoryPattern.model.Pizza;
import org.omg.CORBA.StringHolder;

public class PizzaStore {
    Pizza pizza;
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
