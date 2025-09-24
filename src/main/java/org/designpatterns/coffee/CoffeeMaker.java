package org.designpatterns.coffee;

public class CoffeeMaker {

    private final CoffeeDriver coffeeDriver;

    public CoffeeMaker(CoffeeDriver coffeeDriver){

        this.coffeeDriver = coffeeDriver;
    }

    public void dispense(){
        coffeeDriver.dispenseCoffee();
        coffeeDriver.dispenseWater();
        coffeeDriver.dispenseMilk();
    }
}
