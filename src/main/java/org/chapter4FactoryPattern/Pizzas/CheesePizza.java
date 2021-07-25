package org.chapter4FactoryPattern.Pizzas;

import org.chapter4FactoryPattern.model.Pizza;

public class CheesePizza implements Pizza {
    private double price = 1.5;

    @Override
    public void prepare() {
        System.out.println("CheesePizza Preparing...");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza Baking...");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza Cutting...");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza Boxing...");
        System.out.println("Done!!!!!!!!!");
    }
}
