package org.designpatterns.coffee;


import java.util.HashMap;
import java.util.Map;

public class CoffeeMaker {

    private final CoffeeDriver coffeeDriver;
    private Map<String, Drink> drinks;

    public CoffeeMaker(CoffeeDriver coffeeDriver){
        this.coffeeDriver = coffeeDriver;
        drinks = new HashMap<>();
    }

    public void dispense(String drinkType) {
        Drink drink = drinks.get(drinkType);
        if(drink == null){
            throw new DrinkNotFoundException("Drink " + drinkType + " is not found");
        }
    }

    public void registerDrink(Drink drink){
        this.drinks.put(drink.name(), drink);
    }

    public interface Drink {
        void prepare();
        String name();
    }

}
