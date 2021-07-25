package org.chapter4FactoryPattern;

import org.chapter4FactoryPattern.factory.PizzaFactory;
import org.chapter4FactoryPattern.model.Pizza;
import org.chapter4FactoryPattern.pizzaStore.PizzaStore;

public class App {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("CheesePizza");
    }
}
